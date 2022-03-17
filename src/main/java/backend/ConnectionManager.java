package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static String url;
    private static String username;
    private static String password;
    private static Connection conn;

    public ConnectionManager() {
    }

    public static Connection getConnection() {
        if (conn != null) {
            return conn;
        }
        url = System.getenv("url");
        username = System.getenv("username");
        password = System.getenv("password");

        try  {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");

        } catch (SQLException e) {
            System.out.println("No connection");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
}
