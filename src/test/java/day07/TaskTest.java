package day07;

import day07.practice.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TaskTest {

    @Test
    public void testTaskConstructorAndGetters() {
        // Create a task using the constructor
        TaskDAO task = new TaskDAO("Example Task", 1, "2023-07-22");

        // Test the getters
        Assertions.assertEquals("Example Task", task.getName());
        Assertions.assertEquals(1, task.getId());
        Assertions.assertEquals(LocalDate.parse("2023-07-22"), task.getDeadline());
    }

    @Test
    public void testTaskToString() {
        // Create a task using the constructor
        TaskDAO task = new TaskDAO("Sample Task", 2, "2022-12-31");

        // Test the toString() method
        String expectedString = "Task : Sample Task, Deadline :2022-12-31, Id :2";
        Assertions.assertEquals(expectedString, task.toString());
    }

    @Test
    public void testTaskEqualsAndHashCode() {
        TaskDAO task1 = new TaskDAO("Todo", 1, "2023-07-22");
        TaskDAO task2 = new TaskDAO("Todo", 1, "2023-07-22");
        TaskDAO task3 = new TaskDAO("Sleep", 2, "2015-06-05");

        // Test the equals() method
        Assertions.assertEquals(task1, task2);
        Assertions.assertNotEquals(task1, task3);

        // Test the hashCode() method
        Assertions.assertEquals(task1.hashCode(), task2.hashCode());
        Assertions.assertNotEquals(task1.hashCode(), task3.hashCode());
    }
}
