package day06.practice;
import java.util.ArrayList;
import java.util.List;


public class RemoveDuplicate {
	public static void main(String[] args) {
		// Store the city names in the List
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");


		//here we were creating Array list here.

		List<String> uniqueCityList = new ArrayList<String>();
		// here we can check if the string present the same array

		for (String city : cityList) {
		    if (!uniqueCityList.contains(city)) {
		        uniqueCityList.add(city);
		        System.out.println(city);
		    }
		}
	}
		
}
