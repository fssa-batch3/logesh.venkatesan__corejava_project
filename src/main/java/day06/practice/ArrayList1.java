package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static class Task {
		public String taskName;
		public int priority;
		public Object getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		// Create a list of tasks
		List<Task> taskList = new ArrayList<>();
		Task task1 = new Task();
		task1.taskName = "Task 1";
		task1.priority = 1;

		Task task2 = new Task();
		task2.taskName = "Task 2";
		task2.priority = 2;

		taskList.add(task1);
		taskList.add(task2);
	}
}
