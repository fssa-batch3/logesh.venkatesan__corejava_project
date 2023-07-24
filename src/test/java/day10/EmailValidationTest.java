package day10;

import day10.practice.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailValidatorTest {

    @Test
    void testValidEmail() {
        String validEmail = "jayaprakash@gmail.com";
        try {
            boolean isValid = EmailValidator.isValidEmail(validEmail);
            Assertions.assertTrue(isValid, "Email is valid: " + validEmail);
        } catch (InvalidEmailException e) {
            Assertions.fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    void testInvalidEmail() {
        String invalidEmail1 = "invalidemail";
        String invalidEmail2 = "jp@priyan";
        String invalidEmail3 = "@priyan.com";
        String invalidEmail4 = "jp@.com";

        Assertions.assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail(invalidEmail1));
        Assertions.assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail(invalidEmail2));
        Assertions.assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail(invalidEmail3));
        Assertions.assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail(invalidEmail4));
    }
}
