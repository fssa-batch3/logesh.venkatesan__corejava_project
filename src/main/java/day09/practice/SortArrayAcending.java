package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayAcending {

	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("8");
		cityNames.add("9");
		cityNames.add("45");
		cityNames.add("12");
		cityNames.add("1");
		
		System.out.println("Before Sort:" + cityNames);
		Collections.sort(cityNames);
		System.out.println("After Sort:" + cityNames);
	
	}

}
