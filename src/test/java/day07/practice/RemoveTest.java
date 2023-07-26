package day07.practice;

import day07.practice.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 2));
        List<Integer> expectedUnique = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> uniqueNumbers = RemoveDuplicates.removeDuplicate(numberList);

        Assertions.assertEquals(expectedUnique.size(), uniqueNumbers.size());
        Assertions.assertTrue(uniqueNumbers.containsAll(expectedUnique));
    }
}
