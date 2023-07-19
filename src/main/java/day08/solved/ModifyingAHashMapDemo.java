package day08.solved;

import java.util.HashMap;

public class ModifyingAHashMapDemo {
	public static void main(String[] args) {

		
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);
		System.out.println("Before Modifiing");
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
		

		System.out.println("");
		// Modifying a particular count
		int hrCount = deptMap.get("HR");
		hrCount += 1;
		deptMap.put("HR", hrCount);
		
		System.out.println("After Modifiing");

		// Iterate
		for (String deptName : deptMap.keySet()) {
		
			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
		System.out.println("");
		
		//aftter removing developer
		deptMap.remove("DEVELOPERS");
		System.out.println("After Remove Developer");

		// Iterate
		for (String deptName : deptMap.keySet()) {
		
			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
		
		//check get interface
	
	System.out.println("");
	
	System.out.println("After Do Get interface");

	System.out.println(deptMap.get("ADMIN"));
	
	
	//Check the isboolean Interface
	System.out.println("");
	
	System.out.println("After Do isEmpty() interface");

	System.out.println(deptMap.isEmpty());
	
	
	
	//check put interface

System.out.println("");

System.out.println("After Do put interface");

System.out.println(deptMap.put("ADMIN",4));

//check after put another get interface

System.out.println("");

System.out.println("After Do mody Get interface");

System.out.println(deptMap.get("ADMIN"));

//check get interface

System.out.println("");

System.out.println("After Do Get interface");


//after using clear()
deptMap.clear();
System.out.println(deptMap);


	}
}