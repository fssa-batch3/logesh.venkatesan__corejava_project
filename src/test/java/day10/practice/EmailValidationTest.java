package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import day10.practice.EmailValidator;
import day10.practice.InvalidEmailException;

public class EmailValidationTest {

    
    public void testValidEmail() {
        try {
            String email = "jayaprakash@gmail.com";
            assertTrue(EmailValidator.isValidEmail(email));
        } catch (InvalidEmailException e) {
            fail("Email validation should not throw an exception for a valid email.");
        }
    }

    
    public void testInvalidEmail() {
        try {
            // Change the email to an invalid one.
            String email = "invalid-email";
            EmailValidator.isValidEmail(email);
            fail("Email validation should throw an exception for an invalid email.");
        } catch (InvalidEmailException e) {
            // We expect an InvalidEmailException to be thrown.
            assertEquals("Invalid email address: " + "invalid-email", e.getMessage());
        }
    }
}
