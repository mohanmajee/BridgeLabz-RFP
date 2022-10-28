package day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

    
    

    @Test
    public void givenFirstName_WhenValid_ShouldReturnFalse() {
        boolean actual = userRegistration.firstname("Mohan");
        boolean exacted = false;
        Assertions.assertEquals(exacted, actual);
    }
    @Test
    public void givenLastName_whenValid_shouldReturnTrue(){
        boolean actual = userRegistration.lastName("Majee");
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void givenEmail_whenValid_shouldReturnTrue(){
        boolean actual = userRegistration.email("mohanmajee@ab.co.in");
        boolean expected = true ;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void givenMobileNumber_whenValid_shouldReturnTrue() {
        boolean actual = userRegistration.mobile("91 7001312345");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void givenPassword_whenValid_shouldReturnTrue() {
        boolean actual = userRegistration.password("mohan@1234");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}
