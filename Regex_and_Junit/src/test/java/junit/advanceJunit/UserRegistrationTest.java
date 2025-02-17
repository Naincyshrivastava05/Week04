package junit.advanceJunit;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("Naincy", "naincyShri123@gmail.com", "password123"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "Sanjh@example.com", "password123");
        });

        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Sanjh", "invalid-email", "password123");
        });

        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Vishakha", "vishakha@example.com", "pass");
        });

        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}