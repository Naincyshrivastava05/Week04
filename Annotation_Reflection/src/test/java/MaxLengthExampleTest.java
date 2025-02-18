


import annotation.maxlengthannotation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxLengthExampleTest {

    @Test
    void testValidUsername() {
        User user = new User("Abhi");
        assertEquals("Abhi", user.getUsername());
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("Abhishek123");
        });

        assertEquals("Username exceeds max length of 10 characters.", exception.getMessage());
    }
}