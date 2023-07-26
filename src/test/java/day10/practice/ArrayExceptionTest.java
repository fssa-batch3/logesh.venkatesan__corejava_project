package day10.practice;

import day10.practice.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;


public class ArrayExceptionTest {
    private UserManager userManager;

    @Before
    public void setUp() {
        userManager = new UserManager();
    }

    @Test
    public void testRegisterUsers() {
        ArrayException app = new ArrayException();

        try {
            app.registerUsers();
            assertEquals(2, userManager.getUserCount());
        } catch (UserAlreadyExistsException e) {
            fail("User registration should not throw an exception.");
        }
    }

    @Test
    public void testRegisterDuplicateUser() {
        User user1 = new User(1, "Jayaprakash", "jayaprakash@gmail.com");
        User user2 = new User(2, "Aimal", "ajmal@gmail.com");

        try {
            userManager.register(user1);
            userManager.register(user2);
        } catch (UserAlreadyExistsException e) {
            fail("User registration should not throw an exception for unique users.");
        }

        User duplicateUser = new User(3, "Jayaprakash", "jayaprakash@gmail.com");
        try {
            userManager.register(duplicateUser);
            fail("User registration should throw an exception for duplicate users.");
        } catch (UserAlreadyExistsException e) {
            assertEquals("User with email " + duplicateUser.emailId + " already exists.", e.getMessage());
        }
    }
}


