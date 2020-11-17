package Controller;

import java.sql.*;
import java.util.ArrayList;

public class ControllerDatabase {
    static DataBaseHandler conn = new DataBaseHandler();
//    public static boolean insertMember(Member member) {
//        Date date = new Date(member.getYear()-1900,member.getMonth()-1,member.getDay());
//        conn.connect();
//        String query = "INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?)";
//        try {
//            PreparedStatement stmt = conn.con.prepareStatement(query);
//            stmt.setString(1,member.getUsername());
//            stmt.setString(2,member.getPassword());
//            stmt.setString(3,member.getName());
//            stmt.setString(4,member.getAddress());
//            stmt.setString(5,member.getGender());
//            stmt.setString(6,member.getEmail());
//            stmt.setDate(7,date);
//            stmt.setDouble(8,member.getPoint());
//            stmt.setDouble(9,member.getMoney());
//            stmt.executeUpdate();
//            return (true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return (false);
//        }
//    }
//
//    public static ArrayList<String> getAllUsernames() {
//        ArrayList<String> listUsername = new ArrayList<>();
//        conn.connect();
//        String query = "SELECT * FROM member";
//        try {
//            Statement stmt = conn.con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String username = rs.getString("username");
//                listUsername.add(username);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return (listUsername);
//    }
}
