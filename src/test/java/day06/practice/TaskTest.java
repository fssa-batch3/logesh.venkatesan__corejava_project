package day06.practice;

import day06.practice.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testTaskConstructorAndGetters() {
        // Create a task using the constructor
        Task task = new Task("Example Task", 3);

        // Test the getters
        Assertions.assertEquals("Example Task", task.getTaskName());
        Assertions.assertEquals(3, task.getPriority());
    }

    @Test
    public void testTaskSetters() {
        // Create a task using the constructor
        Task task = new Task("Task 1", 1);

        // Test the setters
        task.setTaskName("Updated Task Name");
        task.setPriority(5);

        Assertions.assertEquals("Updated Task Name", task.getTaskName());
        Assertions.assertEquals(5, task.getPriority());
    }

    @Test
    public void testTaskToString() {
        // Create a task using the constructor
        Task task = new Task("Sample Task", 2);

        // Test the toString() method
        String expectedString = "taskName='Sample Task', priority=2";
        Assertions.assertEquals(expectedString, task.toString());
    }
}
