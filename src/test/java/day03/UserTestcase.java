package day03;
import day03.practice.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestcase {



	    @Test
	    public void testUser() {
	        User e1 = new User("p123", "naresh", "naresh@gmail.com");
	        Assertions.assertEquals("p123", e1.getpassword());
	        Assertions.assertEquals("naresh", e1.getName());
	        Assertions.assertEquals("naresh@gmail.com", e1.getemailid());

	        User e2 = new User("p567", "ajmal", "ajmal@gmail.com");
	        Assertions.assertEquals("pl567", e2.getpassword());
	        Assertions.assertEquals("ajmal", e2.getName());
	        Assertions.assertEquals("ajmal@gmail.com", e2.getemailid());
	        
	        e2.setName("newname");
	        e2.setemailid("newemail@gmail.com");

	        Assertions.assertEquals("newpassword", e2.getpassword());
	        Assertions.assertEquals("newname", e2.getName());
	        Assertions.assertEquals("newemail@gmail.com", e2.getemailid());
	    
	}


}
