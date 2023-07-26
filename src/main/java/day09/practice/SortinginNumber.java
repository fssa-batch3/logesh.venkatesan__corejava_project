package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortinginNumber {

    public static void main(String[] args) {
        // Create an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();

        // Split the input by spaces and parse integers
        String[] numberStrings = input.split(" ");
        for (String numStr : numberStrings) {
            try {
                int num = Integer.parseInt(numStr);
                numbers.add(num);
            } catch (NumberFormatException e) {
                // If the input is not a valid integer, skip it
                System.out.println("Invalid input: " + numStr);
            }
        }

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print the sorted list
        System.out.print("Sorted list: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
