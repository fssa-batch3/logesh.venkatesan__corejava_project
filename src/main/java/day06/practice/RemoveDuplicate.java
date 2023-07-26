package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<String> cityList = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");

        List<String> unique = new ArrayList<String>();

        for (int i = 0; i < cityList.size(); i++) {
            String city = cityList.get(i);
            if (!unique.contains(city)) {
                unique.add(city);
            }
        }


        System.out.println("Unique:");
        for (String city : unique) {
            System.out.println(city);
        }
    }

	public static List<String> removeDuplicates(List<String> cityList) {
		
		return null;
	}

	

}
