package day12.practice;

import day12.practice.*;

import org.junit.jupiter.api.*;

import java.util.List;

class TaskDAOTest {

    private TaskDAO taskDAO;

    @BeforeEach
    void setUp() {
        taskDAO = new TaskDAO();
    }

    @Test
    void testCreateTask() {
        Task task = new Task();
        task.id = 21;
        task.name = "Task";
        task.status = "Process";

        try {
            taskDAO.createTask(task);
        } catch (DAOException e) {
            e.printStackTrace();
            Assertions.fail("Failed to create task: " + e.getMessage());
        }
    }

    @Test
    void testUpdateTask() {
        Task task = new Task();
        task.id = 10;
        task.name = "Create Task";
        task.status = "Completed";

        try {
            taskDAO.updateTask(task);
        } catch (DAOException e) {
            e.printStackTrace();
            Assertions.fail("Failed to update task: " + e.getMessage());
        }
    }

    @Test
    void testDeleteTask() {
        int taskId = 12;

        try {
            taskDAO.deleteTask(taskId);
        } catch (DAOException e) {
            e.printStackTrace();
            Assertions.fail("Failed to delete task: " + e.getMessage());
        }
    }

    @Test
    void testGetAllTasks() {
        try {
            List<Task> tasks = taskDAO.getAllTasks();
            for (Task task : tasks) {
                System.out.println(task.id + " - " + task.name + " - " + task.status);
            }
        } catch (DAOException e) {
            e.printStackTrace();
            Assertions.fail("Failed to get all tasks: " + e.getMessage());
        }
    }
}
