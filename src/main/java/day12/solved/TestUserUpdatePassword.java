package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;

public class TestUserUpdatePassword {
 
    public static void main(String[] args) throws Exception {
 
        Connection connection = ConnectionUtil.getConnection();
 
        // Input
        String userName = "jayaprakash";
        String password = "password007";
        
        // UPDATE PASSWORD
        String query = "UPDATE user SET password=? WHERE username=?";
 
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setString(1, password); // Use the password variable as input for the query
        pst.setString(2, userName); // Use the userName variable as input for the query
 
        int rows = pst.executeUpdate();
        System.out.println("No of rows updated: " + rows);
    }
}
