-- Ejercicio 1
DELIMITER //

CREATE TRIGGER trg_prueba1_doble
BEFORE INSERT ON prueba1
FOR EACH ROW
BEGIN
    SET NEW.numero = NEW.numero * 2;
END//

DELIMITER ;

-- Ejercicio 2

DELIMITER //

CREATE TRIGGER trg_prueba1_sumar_anterior
BEFORE INSERT ON prueba1
FOR EACH ROW
BEGIN
    DECLARE num_anterior INT DEFAULT 0;

    SELECT numero
    INTO num_anterior
    FROM prueba1
    ORDER BY id DESC
    LIMIT 1;

    SET NEW.numero = NEW.numero + IFNULL(num_anterior, 0);
END//

DELIMITER ;

-- Ejercicio 3

DELIMITER //

CREATE TRIGGER trg_prueba2_minimo_1000
BEFORE INSERT ON prueba2
FOR EACH ROW
BEGIN
    IF NEW.cantidad < 1000 THEN
        SET NEW.cantidad = 1000;
    END IF;
END//

DELIMITER ;

-- Ejercicio 4 y 5

DELIMITER //

CREATE TRIGGER trg_prueba2_reglas
BEFORE INSERT ON prueba2
FOR EACH ROW
BEGIN
    IF NEW.cantidad < 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'No se permiten números negativos';
    ELSEIF NEW.cantidad < 1000 THEN
        SET NEW.cantidad = 1000;
    ELSE
        SET NEW.cantidad = NEW.cantidad * 2;
    END IF;
END//

DELIMITER ;

-- Ejercicio 6
DELIMITER //

CREATE TRIGGER trg_usuarios_validar_correo
BEFORE INSERT ON usuarios
FOR EACH ROW
BEGIN
    IF NEW.correo NOT REGEXP '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$' THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El correo electrónico no tiene un formato válido';
    END IF;
END//

DELIMITER ;

