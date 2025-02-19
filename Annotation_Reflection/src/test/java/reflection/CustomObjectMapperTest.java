package reflection;


import org.junit.jupiter.api.Test;
import reflaction.advancelevel.customobjectmapper.CustomObjectMapper;
import reflaction.basiclevel.access_private_field.Person;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class CustomObjectMapperTest {
    private Object getFieldValue(Object obj, String fieldName) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    public void testToObject() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Naincy");
        properties.put("age", 30);
        properties.put("city", "Bhopal");

        Person person = CustomObjectMapper.toObject(Person.class, properties);

        assertNotNull(person);
        assertEquals("Naincy", getFieldValue(person, "name"));
        assertEquals(30, getFieldValue(person, "age"));
        assertEquals("Bhopal", getFieldValue(person, "city"));
    }


}
