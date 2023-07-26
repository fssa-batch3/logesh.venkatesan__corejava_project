package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameCount {

    public static Map<String, Integer> getNameCountMap(String input) {
        Map<String, Integer> nameCountMap = new HashMap<>();

        String[] names = input.split(",\\s*");
        for (String name : names) {
            nameCountMap.put(name.toLowerCase().trim(), nameCountMap.getOrDefault(name.toLowerCase().trim(), 0) + 1);
        }

        return nameCountMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        Map<String, Integer> nameCountMap = getNameCountMap(input);

        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
    }
}
