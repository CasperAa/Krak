package backend.repository;

import java.sql.*;

public class HobbyRepo {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn= null;
        try {
            conn= DriverManager.getConnection("jdbc.mysql://localhost:3306/krak", "andrea", "1");
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
        finally {
            try{
                if(conn!=null){
                    conn.close();
                }
            }

            catch(SQLException e){

            }
        }
    }
}
