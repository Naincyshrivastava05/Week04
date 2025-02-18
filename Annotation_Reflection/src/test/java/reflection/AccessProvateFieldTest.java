package reflection;

import org.junit.jupiter.api.Test;
import reflaction.basiclevel.access_private_field.Person;

import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class AccessPrivateFieldTest {

    @Test
    public void testPrivateFieldModification() throws Exception {
        Person person = new Person(30);

        Class<?> cls = person.getClass();

        Field nameField = cls.getDeclaredField("name");
        Field ageField = cls.getDeclaredField("age");

        nameField.setAccessible(true);
        ageField.setAccessible(true);

        assertEquals("Naincy", nameField.get(person));
        assertEquals(22, ageField.get(person));

        nameField.set(person, "Sanjh");
        ageField.set(person, 21);

        assertEquals("Vaishali", nameField.get(person));
        assertEquals(21, ageField.get(person));

        person.displayAge();
    }
}
