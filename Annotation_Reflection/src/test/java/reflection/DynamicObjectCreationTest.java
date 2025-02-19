package reflection;

import org.junit.jupiter.api.Test;
import reflaction.basiclevel.dynamicallycreateobjects.Student;


import java.lang.reflect.Constructor;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicObjectCreationTest {

    @Test
    public void testDynamicObjectCreation() throws Exception {
        Class<?> cls = Class.forName("reflection.dynamicallycreateobjects.Student");

        Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
        Object obj = constructor.newInstance("Naincy", 22);

        assertNotNull(obj);

        Student student = (Student) obj;
        assertEquals("Naincy", student.getName());
        assertEquals(22, student.getAge());
    }
}