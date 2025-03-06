package bus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/bus_system"; // Your database name
    private static final String USER = "root"; // Change if needed
    private static final String PASSWORD = "Tharoeun@2456"; // Your MySQL password

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Test connection
        getConnection();
    }
}
