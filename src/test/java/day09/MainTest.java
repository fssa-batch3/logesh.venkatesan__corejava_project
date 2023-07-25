package day09;

import day09.practice.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSortTasks() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<String> inputTasks = Arrays.asList(
                "1,Task A,2023-07-30",
                "2,Task B,2023-07-25",
                "3,Task C,2023-07-28"
        );

        List<TaskDAO> expected = Arrays.asList(
                new TaskDAO(2, "Task B", LocalDate.parse("2023-07-25", formatter)),
                new TaskDAO(3, "Task C", LocalDate.parse("2023-07-28", formatter)),
                new TaskDAO(1, "Task A", LocalDate.parse("2023-07-30", formatter))
        );

        List<TaskDAO> actual = Main.sortTasks(inputTasks);

        assertEquals(expected, actual);
    }
}
