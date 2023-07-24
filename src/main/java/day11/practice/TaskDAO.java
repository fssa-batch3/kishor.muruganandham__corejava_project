package day11.practice;

import day11.solved.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDAO {

    public void createTask(Task task) throws DAOException, SQLException {
        // Step 01: Get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "root");
        System.out.println(connection);

        // Step 02: Create a Statement
        String query = "INSERT INTO task (id, task, status) VALUES (?, ?, ?)";

        // Step 03: Execute Insert Query
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, task.id);
        stmt.setString(2, task.name);
        stmt.setString(3, task.status);
        stmt.executeUpdate();
        System.out.println("Row Inserted Successfully");

        //Step 04: close the connection resources
        ConnectionUtil.close(connection, stmt, null);
    }
}
