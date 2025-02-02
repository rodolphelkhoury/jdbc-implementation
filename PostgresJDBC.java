import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresJDBC {

    public static void main(String[] argv) {

        String url = "jdbc:postgresql://localhost:5432/first_database";
        String user = "postgres";
        String password = "1234";

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL JDBC Driver Registered!");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found.");
            e.printStackTrace();
            return;
        }

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            if (connection != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
                
                try (Statement stmt = connection.createStatement()) {
                    String sql = "CREATE TABLE IF NOT EXISTS first_table (id SERIAL PRIMARY KEY, name VARCHAR(50))";
                    stmt.executeUpdate(sql);
                    System.out.println("Table created successfully!");
                }

            } else {
                System.out.println("Failed to make a connection.");
            }

        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
