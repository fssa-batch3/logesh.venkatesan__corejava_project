package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*: Read comma separated list of names from the user and print count 

HINT: Use a `HashMap<String, Integer>`

Sample Input

Enter the string: Ram, Ram, Superman, spider, hey, hello, hey, Spider

Output

Ram: 2

Superman: 1

Spider: 2

hey: 2

hello: 1*/

public class CommaSeparated {


	
	    public static void main(String[] args) {
	    	Scanner get = new Scanner(System.in);
	    	System.out.print("Enter the String: ");
	        String input = get.nextLine();
	       
	                Map<String, Integer> wordCountMap = new HashMap<>();
	                String[] words = input.split(",");

	                for (String word : words) {
	                	String trimmedWord = word.trim();
	                	String lowercaseWord = trimmedWord.toLowerCase();
	                    
	                    wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
	                }

	                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	                    System.out.println(entry.getKey() + " " + entry.getValue());
	                }
	            }
	        }


	


