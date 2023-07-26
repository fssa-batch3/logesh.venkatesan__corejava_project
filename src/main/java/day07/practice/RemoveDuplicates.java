package day07.practice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(2);

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : numberList) {
            uniqueNumbers.add(number);
        }

        System.out.println(numberList);
        System.out.println( uniqueNumbers);
    }

	public static List<Integer> removeDuplicate(List<Integer> numberList) {
		
		return null;
	}
}




