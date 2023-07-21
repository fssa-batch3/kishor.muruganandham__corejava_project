package day10.practice;

public class Main {

    public static void main(String[] args) {
        try {
            String email = "kishor@gmail.com";
            ValidateEmail.isValidEmail(email);

            ValidateUser user = new ValidateUser();
            user.register(new ValidateUser(1, "Kishor", email));
            user.register(new ValidateUser(1, "Kishor", email));

            System.out.println("User registered successfully.");
        } catch (InvalidEmailException | UserAlreadyExistsException e) {
            e.printStackTrace();
        }

    }
}
