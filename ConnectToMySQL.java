package SecondPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToMySQL {
    public static void main(String[] args) {
        Connection connection = null;

        try {
           
            String url = "jdbc:mysql://localhost:3306/details";
            String user = "root";
            String password = "Varun@0162002";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to connect to the database.");
            }

        } catch (SQLException e) {
            
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
