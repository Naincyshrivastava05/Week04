package junit.advanceJunit;

package advancedjunit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValidPassword("Password123"));
        assertTrue(PasswordValidator.isValidPassword("StrongPass9"));

    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValidPassword("pass123"));
        assertFalse(PasswordValidator.isValidPassword("PASSWORD"));

    }

}