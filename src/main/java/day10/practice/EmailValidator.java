package day10.practice;

public class EmailValidator {
    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
        if (emailId == null || !emailId.contains("@") || !emailId.endsWith(".com")) {
            throw new InvalidEmailException("Invalid email address: " + emailId);
        }
        return true;
    }
}
