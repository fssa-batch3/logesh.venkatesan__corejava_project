package day03.practice;

public class UserTest {

	public static void main(String[] args) {
		 User e1 = new User("p123", "naresh","naresh@gmail.com");
	        
	        System.out.println( e1.getpassword()+ " "+  e1.getemailid()+ " "+e1.getName() );
	        
	        User e2 = new User("P567", "ajmal","ajmal@gmail.com");
	        
	        
	        
	        System.out.println(e1.getpassword()+ " "+e2.getemailid()+ " "+e2.getName()) ;
	}

}
