package day06.practice;

import day06.practice.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class FindTaskTest {
    
    @Test
    void testFindTaskByName() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Coding", 2));
        tasks.add(new Task("Sleep", 1));
        tasks.add(new Task("Food", 3));

        // Test if an existing task is found
        boolean foundTask = FindTask.findTaskByName("Coding", tasks);
        assertTrue(foundTask, "Existing task should be found");

        // Test if a non-existing task is not found
        foundTask = FindTask.findTaskByName("Read a Book", tasks);
        assertFalse(foundTask, "Non-existing task should not be found");
    }
}
