import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/concesionario";
    private static final String USER = "root";
    private static final String PASSWORD = "Admin2025";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}