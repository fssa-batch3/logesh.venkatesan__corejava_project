package day06.practice;


import java.util.ArrayList;

public class FindTask {
    public static void main(String[] args) {
    
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Coding", 2));
        tasks.add(new Task("Sleep", 1));
        tasks.add(new Task("Food", 3));

        boolean foundTask = findTaskByName("Read a Book", tasks);
        System.out.println("Task found or not: " + foundTask);
    }

    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(name)) {
                return true; // found, return true
            }
        }
        return false; //not found, return false
    }
}
