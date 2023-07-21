package day10.practice;

import java.util.regex.Pattern;

public class ValidateEmail {
    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        if (emailId == null){
            throw new IllegalArgumentException("Email Id is null");
        } else if (emailId.equals("")) {
            throw new IllegalArgumentException("Email Id is Empty");
        } else if (!pattern.matcher(emailId).matches()) {
            throw new InvalidEmailException("Invalid email");
        }

        return true;
    }

}
