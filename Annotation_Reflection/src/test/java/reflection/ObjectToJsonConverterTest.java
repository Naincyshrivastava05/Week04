package reflection;

import org.junit.jupiter.api.Test;
import reflaction.advancelevel.generatejsonrepresentation.ObjectToJsonConverter;
import reflaction.advancelevel.generatejsonrepresentation.Person;


import static org.junit.jupiter.api.Assertions.*;

public class ObjectToJsonConverterTest {

    @Test
    public void testToJson() {
        Person person = new Person("Naincy", 22, false);
        String json = ObjectToJsonConverter.toJson(person);

        assertTrue(json.contains("\"name\":\"Naincy\""));
        assertTrue(json.contains("\"age\":22"));
        assertTrue(json.contains("\"isStudent\":false"));
    }
}