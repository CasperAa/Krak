package backend.repository;

import backend.ConnectionManager;
import backend.entity.Hobby;

import java.sql.*;
import java.util.ArrayList;

public class HobbyRepo {

    Connection conn = ConnectionManager.getConnection();

    public ArrayList<Hobby> getAllHobbies() {
        ArrayList<Hobby> allHobbies = new ArrayList<>();

        try {
            PreparedStatement stmt = conn.prepareStatement("select* from hobby");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Hobby hobby = new Hobby();

                hobby.setName(rs.getString(1));
                hobby.setCategory(rs.getString(2));
                hobby.setLink(rs.getString(3));
                hobby.setInOut(rs.getString(4));

                allHobbies.add(hobby);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Hobby failed");
        }
        return allHobbies;

    }
}

