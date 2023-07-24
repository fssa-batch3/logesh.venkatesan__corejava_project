package day08;

import day08.practice.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {

    @Test
    public void testGetNameCountMap() {
        String input = "John, Alice, Bob, John, alice, Bob, John, Mary, Mary";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("john", 3);
        expected.put("alice", 2);
        expected.put("bob", 2);
        expected.put("mary", 2);

        Map<String, Integer> actual = NameCount.getNameCountMap(input);

        assertEquals(expected, actual);
    }
}
