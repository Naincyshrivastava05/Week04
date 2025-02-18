
import annotation.todoannotation.ProjectTask;
import annotation.todoannotation.Todo;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
class TodoAnnotationExampleTest {
    @Test
    void testTodoAnnotation() {
        Class<?> cls = ProjectTask.class;
        Method[] methods = cls.getDeclaredMethods();

        int todoCount = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                assertNotNull(annotation, "Annotation should not be null");
                todoCount++;

                if (method.getName().equals("implementAuth")) {
                    assertEquals("Implement user authentication", annotation.task());
                    assertEquals("Abhishek Kumar", annotation.assignedTo());
                    assertEquals("HIGH", annotation.priority());
                } else if (method.getName().equals("optimizeDatabase")) {
                    assertEquals("Optimize database queries", annotation.task());
                    assertEquals("Muskan Sharma", annotation.assignedTo());
                    assertEquals("MEDIUM", annotation.priority()); // Default value
                } else if (method.getName().equals("integratePayment")) {
                    assertEquals("Add payment gateway integration", annotation.task());
                    assertEquals("Rahul Singh", annotation.assignedTo());
                    assertEquals("HIGH", annotation.priority());
                }
            }
        }
        assertEquals(3, todoCount, "There should be exactly 3 pending tasks.");
    }

}