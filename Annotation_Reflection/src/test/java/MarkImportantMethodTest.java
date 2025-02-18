
import annotation.markimportantmethod.ImportantMethod;

import annotation.markimportantmethod.TaskManager;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;


class MarkImportantMethodTest {
    @Test
    void testImportantMethodsAnnotation() {
        Class<?> cls = TaskManager.class;
        Method[] methods = cls.getDeclaredMethods();

        int importantMethodsCount = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                assertNotNull(annotation, "Annotation should not be null");
                importantMethodsCount++;
                System.out.println("Im under the water");

                if (method.getName().equals("processCriticalTask")) {
                    assertEquals("HIGH", annotation.level());
                } else if (method.getName().equals("processRegularTask")) {
                    assertEquals("MEDIUM", annotation.level());
                }
            }
        }
        assertEquals(2, importantMethodsCount);
    }


}