package day10.practice;

public class EmailValidation {
    public static void main(String[] args) {
        EmailValidation app = new EmailValidation();
        app.validateEmail();
    }

    public void validateEmail() {
        try {
            String email = "jayaprakash@gmail.com";
            EmailValidator.isValidEmail(email);
            System.out.println("Email is valid: " + email);
        } catch (InvalidEmailException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
