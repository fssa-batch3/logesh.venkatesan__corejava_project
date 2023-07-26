package day06.practice;
import java.util.ArrayList;
public class TestTask {

	


	    public static void main(String[] args) {
	      
	        ArrayList<Task> taskList = new ArrayList<>();

	      
	        Task task1 = new Task("Complete React Assignment", 2);
	        Task task2 = new Task("Go to ooty", 1);
	        Task task3 = new Task("Enjoy", 3);

	        taskList.add(task1);
	        taskList.add(task2);
	        taskList.add(task3);

	   
	        for (int i=0;i<taskList.size();i++) {
	            System.out.println(taskList.get(i));
	        }
	    }
	}




