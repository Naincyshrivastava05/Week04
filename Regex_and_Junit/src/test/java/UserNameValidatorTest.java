import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    @Test
    void testValidUsernames() {
        assertTrue(UserNameValidator.isValidUsername("user_123"));
        assertTrue(UserNameValidator.isValidUsername("UserName_9"));
        assertTrue(UserNameValidator.isValidUsername("hello_12345"));
        assertTrue(UserNameValidator.isValidUsername("Test_User"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(UserNameValidator.isValidUsername("123user"));   // Starts with a number
        assertFalse(UserNameValidator.isValidUsername("us"));        // Too short (less than 5 characters)
        assertFalse(UserNameValidator.isValidUsername("this_is_a_very_long_username")); // Too long (>15 characters)
        assertFalse(UserNameValidator.isValidUsername("user@name")); // Contains '@' (not allowed)
        assertFalse(UserNameValidator.isValidUsername("user-name")); // Contains '-' (not allowed)
        assertFalse(UserNameValidator.isValidUsername("_username")); // Starts with '_'
        assertFalse(UserNameValidator.isValidUsername("Username!")); // Contains special characters
    }
}
