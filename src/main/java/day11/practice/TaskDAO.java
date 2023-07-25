package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskDAO {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/project";
        String username = "root";
        String password = "780808";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            String sql = "CREATE TABLE TASK " +
                         "(id INTEGER not NULL, " +
                         " first VARCHAR(255), " +
                         " last VARCHAR(255), " +
                         " Status VARCHAR(255), " +
                         " PRIMARY KEY (id))";

            statement.executeUpdate(sql);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
