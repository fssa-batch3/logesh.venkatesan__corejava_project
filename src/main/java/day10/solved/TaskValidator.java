package day10.solved;


/**
**
 * Custom exception to handle cases when 
 * there are exception during validation
 * 
 * @author BharathwajSoundarara
 *
 */
public class TaskValidator12 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public TaskValidator12(String msg) {
		super(msg);
	}

	public TaskValidator12(Throwable te) {
		super(te);
	}

	public TaskValidator12(String msg, Throwable te) {
		super(msg, te);
	}
}

class Task {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class TaskValidator1 {
	public static boolean validate(Task task) throws TaskValidator12 {
		if (task == null)
			throw new TaskValidator12("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new TaskValidator12("Task name is empty");
			return true;
	}
}

public class TaskValidator {
	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); Commenting this so that exception is thrown
		
		try {
			TaskValidator1.validate(task);
		} catch (TaskValidator12 e) {
			e.printStackTrace();
		}
	
}
}