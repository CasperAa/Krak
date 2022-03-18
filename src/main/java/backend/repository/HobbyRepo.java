package backend.repository;

import backend.ConnectionManager;

import java.sql.*;

public class HobbyRepo {

    public static void main(String[] args) throws SQLException {
        Connection conn;

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Something went wrong");
        }

        try {
            conn= ConnectionManager.getConnection();
            String query = "select name, link, category,inOUt ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);


            //display data
            while (rs.next()){
                String id= rs.getString("name");
                String link= rs.getString("link");
                String category= rs.getString("category");
                String inOut = rs.getString("inOut");
                System.out.println(id + link + category+ inOut);
            }
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
