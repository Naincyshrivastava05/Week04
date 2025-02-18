

import annotation.serializationannotaion.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonSerializationExampleTest {
    @Test
    void testJsonSerialization() throws IllegalAccessException {
        User user = new User("Abhi", 30, "password123");
        String json = JsonSerializer.toJson(user);

        assertTrue(json.contains("\"user_name\": \"Abhi\""));
        assertTrue(json.contains("\"user_age\": \"30\""));
        assertFalse(json.contains("password"));
    }

}
