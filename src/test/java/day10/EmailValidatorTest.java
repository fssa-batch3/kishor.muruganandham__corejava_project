package day10;

import day10.practice.InvalidEmailException;
import day10.practice.ValidateEmail;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailValidatorTest {

    @Test
    public void testValidEmail(){
        try {
			assertTrue(ValidateEmail.isValidEmail("kishor@example.com"));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
    }

    @Test
    public void testInvalidEmail(){
        try {
			assertFalse(ValidateEmail.isValidEmail("invalid.email"));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
//    	assertThrows(InvalidEmailException.class, () -> ValidateEmail.isValidEmail("invalid.email"));
    }
}
