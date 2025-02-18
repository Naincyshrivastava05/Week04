
import annotation.customannotation.TaskInfo;
import annotation.customannotation.TaskManager;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CustomAnnotationTest {
    @Test
    void testTaskInfoAnnotation() throws Exception {
        Class<?> cls = TaskManager.class;

        Method completeProjectMethod = cls.getDeclaredMethod("completeProject");
        Method reviewCodeMethod = cls.getDeclaredMethod("reviewCode");
        Method generalTaskMethod = cls.getDeclaredMethod("generalTask");

        assertTrue(completeProjectMethod.isAnnotationPresent(TaskInfo.class), "completeProject should have @TaskInfo");
        assertTrue(reviewCodeMethod.isAnnotationPresent(TaskInfo.class), "reviewCode should have @TaskInfo");
        assertFalse(generalTaskMethod.isAnnotationPresent(TaskInfo.class), "generalTask should NOT have @TaskInfo");

        TaskInfo taskInfo1 = completeProjectMethod.getAnnotation(TaskInfo.class);
        assertEquals("High", taskInfo1.priority());
        assertEquals("Naincy", taskInfo1.assignedTo());

        TaskInfo taskInfo2 = reviewCodeMethod.getAnnotation(TaskInfo.class);
        assertEquals("Medium", taskInfo2.priority());
        assertEquals("Sanjh", taskInfo2.assignedTo());
    }

}