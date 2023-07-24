package day06;

import day06.practice.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateTest {

    @Test
    public void testRemoveDuplicates_Correct() {
        List<String> cityList = new ArrayList<>(Arrays.asList("Chennai", "Bangalore", "Mumbai", "Mumbai"));
        List<String> expectedUnique = new ArrayList<>(Arrays.asList("Chennai", "Bangalore", "Mumbai"));

        List<String> unique = RemoveDuplicate.removeDuplicates(cityList);

        Assertions.assertIterableEquals(expectedUnique, unique);
    }

    @Test
    public void testRemoveDuplicates_Incorrect() {
        List<String> cityList = new ArrayList<>(Arrays.asList("Chennai", "Bangalore", "Mumbai", "Mumbai"));
        // Wrong expected result with an additional city "Delhi"
        List<String> expectedUnique = new ArrayList<>(Arrays.asList("Chennai", "Bangalore", "Mumbai", "Delhi"));

        List<String> unique = RemoveDuplicate.removeDuplicates(cityList);

        Assertions.assertIterableEquals(expectedUnique, unique);
    }
}
