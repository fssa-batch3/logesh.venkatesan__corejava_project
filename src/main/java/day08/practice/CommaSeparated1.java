package day08.practice;
import java.util.*;


public class CommaSeparated1 {
	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Map<String, List<String>> departmentEmployees = new HashMap<>();

	        System.out.println("Enter comma-separated Department Name and Employee Name (Type 'exit' to stop):");
	        String input;
	        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
	            String[] data = input.split(",");
	            if (data.length != 2) {
	                System.out.println("Invalid input format. Please enter in the format 'DeptName, EmployeeName'");
	                continue;
	            }

	            String deptName = data[0].trim();
	            String employeeName = data[1].trim();

	             if (departmentEmployees.containsKey(deptName)) {
	                List<String> employees = departmentEmployees.get(deptName);
	                employees.add(employeeName);
	            } else {
	                List<String> employees = new ArrayList<>();
	                employees.add(employeeName);
	                departmentEmployees.put(deptName, employees);
	            }
	        }

	         for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
	            String deptName = entry.getKey();
	            List<String> employees = entry.getValue();
	            System.out.println(deptName + ", " + employees);
	        }

	        scanner.close();
	    }
	

}
