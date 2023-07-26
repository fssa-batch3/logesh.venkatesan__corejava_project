package day08.practice;
import java.util.*;

public class Department {
    public static Map<String, List<String>> getDepartmentEmployees(Scanner scanner) {
        System.out.println("Enter the comma-separated Department, Employee (press Enter twice to finish):");

        HashMap<String, List<String>> departmentEmployees = new HashMap<>();

        while (true) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            String[] values = line.split(",");
            String department = values[0].trim();
            String employee = values[1].trim();

            if (departmentEmployees.containsKey(department)) {
                List<String> employees = departmentEmployees.get(department);
                employees.add(employee);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployees.put(department, employees);
            }
        }

        return departmentEmployees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> departmentEmployees = getDepartmentEmployees(scanner);

        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();

            StringBuilder output = new StringBuilder(department + ": ");
            for (int i = 0; i < employees.size(); i++) {
                output.append(employees.get(i));
                if (i < employees.size() - 1) {
                    output.append(", ");
                }
            }
            System.out.println(output.toString());
        }
    }
}
