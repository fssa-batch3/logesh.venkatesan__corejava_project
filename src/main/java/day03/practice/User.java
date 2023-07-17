package day03.practice;

public class User {
    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	private String password;
    private String emailId;

    public User() {
        // Default constructor
    }

    public User(String name, String password, String emailId) {
        this.name = name;
        this.password = password;
        this.emailId = emailId;
    }

    // Getters and setters for the variables

    public static void main(String[] args) {
        User user1 = new User(); // Calling default constructor
        User user2 = new User("John", "password123", "john@example.com"); // Calling overloaded constructor

        // Accessing the properties
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getEmailId());
    }
}
