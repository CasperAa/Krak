package backend.repository;

import backend.ConnectionManager;

import java.sql.*;

public class HobbyRepo {

    public static void main(String[] args) throws SQLException {
        Connection conn;



        try {
            conn= ConnectionManager.getConnection();
            String query = "select name, link, category,in_out from krak.hobby ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);




            //display data
            while (rs.next()){
                String id= rs.getString("name");
                String link= rs.getString("link");
                String category= rs.getString("category");
                String inOut = rs.getString("in_out");
                System.out.println(id + link + category+ inOut);
            }
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
