-- 1) Trigger TRGKmInicial
DROP TRIGGER IF EXISTS TRGKmInicial;
DELIMITER //

CREATE TRIGGER TRGKmInicial
BEFORE INSERT ON usos_coche
FOR EACH ROW
BEGIN
    DECLARE ultimo_km INT DEFAULT 0;

    SELECT IFNULL(km_final, 0)
    INTO ultimo_km
    FROM usos_coche
    ORDER BY id_uso DESC
    LIMIT 1;

    SET NEW.km_inicial = IFNULL(ultimo_km, 0);
END//
DELIMITER ;

-- 2) Trigger TRGmail

DELIMITER //
CREATE TRIGGER TRGmail
BEFORE INSERT ON usuarios_triggers
FOR EACH ROW
BEGIN
    IF NEW.email IS NULL OR NEW.email NOT REGEXP '^[^ ]+@[A-Za-z0-9.-]+\\.[A-Za-z]{3}$' THEN
        SET NEW.email = NULL;
    END IF;
END//

DELIMITER ;

-- 3) Trigger TRGDNI

DELIMITER //

CREATE TRIGGER TRGDNI
BEFORE INSERT ON usuarios_triggers
FOR EACH ROW
BEGIN
    DECLARE letras VARCHAR(23) DEFAULT 'TRWAGMYFPDXBNJZSQVHLCKE';
    DECLARE numero INT;
    DECLARE letra_correcta CHAR(1);
    DECLARE dni_sin_letra VARCHAR(8);

    IF NEW.dni IS NOT NULL AND CHAR_LENGTH(NEW.dni) = 8 THEN
        SET numero = CAST(NEW.dni AS UNSIGNED);
        SET letra_correcta = SUBSTRING(letras, (numero % 23) + 1, 1);
        SET NEW.dni = CONCAT(NEW.dni, letra_correcta);
    ELSEIF NEW.dni IS NOT NULL AND CHAR_LENGTH(NEW.dni) = 9 THEN
        SET dni_sin_letra = SUBSTRING(NEW.dni, 1, 8);
        SET numero = CAST(dni_sin_letra AS UNSIGNED);
        SET letra_correcta = SUBSTRING(letras, (numero % 23) + 1, 1);

        IF UPPER(SUBSTRING(NEW.dni, 9, 1)) <> letra_correcta THEN
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'La letra del DNI no es correcta';
        END IF;
    END IF;
END//

DELIMITER ;

-- 4a) Tabla CLIENTES
DROP TABLE IF EXISTS clientes_modif_triggers;
DROP TABLE IF EXISTS clientes_triggers;

CREATE TABLE clientes_triggers (
    Id INT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Id_empleado INT NOT NULL
);	

-- 4b) Variable y trigger contador
SET @clientes125 = 0;

DROP TRIGGER IF EXISTS ACTUALIZA_clientes125;
DELIMITER //

CREATE TRIGGER ACTUALIZA_clientes125
BEFORE INSERT ON clientes_triggers
FOR EACH ROW
BEGIN
    IF NEW.Id_empleado = 125 THEN
        SET @clientes125 = @clientes125 + 1;
    END IF;
END//

DELIMITER ;

-- 4d) Tabla CLIENTES_MODIF
CREATE TABLE clientes_modif_triggers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    empleado_antiguo INT NOT NULL,
    empleado_nuevo INT NOT NULL,
    usuario VARCHAR(100) NOT NULL,
    momento DATETIME NOT NULL
);

-- 4e) Trigger CAMBIO_EMPLEADO
DELIMITER //

CREATE TRIGGER CAMBIO_EMPLEADO
BEFORE UPDATE ON clientes_triggers
FOR EACH ROW
BEGIN
    IF OLD.Id_empleado <> NEW.Id_empleado THEN
        INSERT INTO clientes_modif_triggers
            (Nombre, Apellidos, empleado_antiguo, empleado_nuevo, usuario, momento)
        VALUES
            (OLD.Nombre, OLD.Apellidos, OLD.Id_empleado, NEW.Id_empleado, CURRENT_USER(), NOW());
    END IF;
END//

DELIMITER ;

-- Cambio a clientes --
ALTER TABLE clientes_triggers
    CHANGE Id DNI VARCHAR(9) NOT NULL,
    ADD CONTRASEÑA VARCHAR(10),
    ADD TELEFONO VARCHAR(20);
    
    
-- 6) Trigger TRIG5
DELIMITER //

CREATE TRIGGER TRIG5
BEFORE INSERT ON clientes_triggers
FOR EACH ROW
BEGIN
    IF NEW.CONTRASEÑA IS NULL OR NEW.CONTRASEÑA = '' THEN
        SET NEW.CONTRASEÑA = LEFT(SHA1(NEW.DNI), 10);
    END IF;
END//

DELIMITER ;

-- 7) Trigger TRIG6
DELIMITER //

CREATE TRIGGER TRIG6
BEFORE INSERT ON clientes_triggers
FOR EACH ROW
BEGIN
    IF CHAR_LENGTH(NEW.TELEFONO) = 6 THEN
        SET NEW.TELEFONO = CONCAT('958', NEW.TELEFONO);
    END IF;
END//

DELIMITER ;
	