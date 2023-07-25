package day06;

import day06.practice.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class FindTaskTest {
    
    @Test
    void testFindTaskByName() {
        ArrayList<TaskDAO> tasks = new ArrayList<>();
        tasks.add(new TaskDAO("Coding", 2));
        tasks.add(new TaskDAO("Sleep", 1));
        tasks.add(new TaskDAO("Food", 3));

        // Test if an existing task is found
        boolean foundTask = FindTask.findTaskByName("Coding", tasks);
        assertTrue(foundTask, "Existing task should be found");

        // Test if a non-existing task is not found
        foundTask = FindTask.findTaskByName("Read a Book", tasks);
        assertFalse(foundTask, "Non-existing task should not be found");
    }
}
