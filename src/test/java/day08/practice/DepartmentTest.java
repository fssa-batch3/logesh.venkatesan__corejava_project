package day08.practice;

import day08.practice.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {

    @Test
    public void testGetDepartmentEmployees() {
        String input = "Department A, Employee 1\n" +
                       "Department B, Employee 2\n" +
                       "Department A, Employee 3\n" +
                       "\n"; 

        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Department A", Arrays.asList("Employee 1", "Employee 3"));
        expected.put("Department B", Collections.singletonList("Employee 2"));

        Map<String, List<String>> actual = Department.getDepartmentEmployees(scanner);

        assertEquals(expected, actual);
    }
}
