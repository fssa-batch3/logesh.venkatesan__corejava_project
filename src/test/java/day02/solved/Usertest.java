package day02.solved;

import day02.practice.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Usertest {

    @Test
    public void testUserAttributes() {
        // Create a User object
        User user = new User();

        // Set attribute values using setters
        user.setId(1);
        user.setName("Jayaprakash");
        user.setPassword("jayaprakash123");
        user.setEmailId("jayaprakash@gmail.com");

        // Verify attribute values using getters
        assertEquals(1, user.getId());
        assertEquals("Jayaprakash", user.getName());
        assertEquals("jayaprakash123", user.getPassword());
        assertEquals("jayaprakash@gmail.com", user.getEmailId());
    }
}
