package day09.practice;

import day09.solved.*;

import org.junit.jupiter.api.Test;

import day08.solved.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapDemoTest {

    @Test
    public void testGetDepartmentMap() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("HR", 5);
        expected.put("ADMIN", 10);
        expected.put("DEVELOPERS", 300);

        Map<String, Integer> actual = HashMapDemo.getDepartmentMap();

        assertEquals(expected, actual);
    }
}
