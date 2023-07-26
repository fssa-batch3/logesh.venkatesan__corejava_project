package day11.practice;

import day11.practice.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskDAOTest {
    @Test
    void testCreateTask() {
        TaskDAO taskDAO = new TaskDAO();
        Task task = new Task();
        task.id = 1;
        task.name = "Sample Task";
        task.status = "Pending";

        try {
            taskDAO.createTask(task);
        } catch (DAOException e) {
            Assertions.fail("DAOException occurred: " + e.getMessage());
        }
    }
}
