import custom_exception.CustomException;
import custom_exception.InvalidAgeException;
import org.junit.jupiter.api.Test;

import static custom_exception.CustomException.*;
import static org.junit.jupiter.api.Assertions.*;


public class CustomExceptionTest {
    @Test
    public void inValidAgeCheck() throws InvalidAgeException {
        int age = 10;
        assertThrows(InvalidAgeException.class,()-> validAge(age));
    }
    @Test
    public void validAgeCheck(){
        int age = 19;
        assertDoesNotThrow(()->validAge(age));
    }
}
