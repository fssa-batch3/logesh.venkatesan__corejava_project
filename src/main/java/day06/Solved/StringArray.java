package day06.Solved;

public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";
		
		
		
		

		// Display the city names
		System.out.println("Initial Output-1:");
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		System.out.println("");
		
		cityArr[1]="Kolkata";
		System.out.println("New Output-1:");
		for (String cityName : cityArr) {
			
			System.out.println(cityName);
		}
		System.out.println("");
		
		
		cityArr[3]="Delhi";
		System.out.println("New Output-2:");
		for (String cityName : cityArr) {
			
			System.out.println(cityName);
		}
		
System.out.println("");
		
		
		cityArr[2]=cityArr[3];
		System.out.println("New Output-3:");
		for (String cityName : cityArr) {
			
			System.out.println(cityName);
		}
	
	}}
