package day10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import day10.practice.UserAlreadyExistsException;
import day10.practice.ValidateUser;
import org.junit.jupiter.api.Test;

class TestRegisterUser {

    @Test
    void testUser() {
        ValidateUser user = new ValidateUser();
        ValidateUser newUser = new ValidateUser(1, "Kishor", "kishor@gmail.com");

        try {
            user.register(newUser);
            ArrayList<ValidateUser> arr = user.getArr();
            assertEquals("kishor@gmail.com",arr.get(arr.size()-1).getEmailId());
        } catch (UserAlreadyExistsException e) {
            e.printStackTrace();
        }

    }

}
