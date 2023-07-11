package day02.practice;
/*Question#1 (For Encapsulation): Create a **User** 
 * class with attribute id, name, password, emailId 
 * and create setters and getters for the same. 
 * Please note no attribute should be available publicly 
 * they should be only be accessible via the setters and getters.*/


public class User {
public String UserName;
public int UserId;
public String UserPassword;
public String Email;

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getUserPassword() {
	return UserPassword;
}

public void setUserPassword(String userPassword) {
	UserPassword = userPassword;
}

public int getUserId() {
	return UserId;
}

public void setUserId(int userId) {
	UserId = userId;
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
} 

	public static void main(String[] args) {
		User user = new User();
		user.setEmail("Loki@gmail.com");
		user.setUserId(12345);
		user.setUserName("Lokesh");
		user.setUserPassword("loki1234");
		
		System.out.println( "UserEmail : "+user.getEmail());
		System.out.println(  "UserID : "+user.getUserId());
		System.out.println(  "UserName : "+user.getUserName());
		System.out.println(  "UserPassword : "+user.getUserPassword());
	}
	
}
