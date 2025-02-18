package annotation.customannotation;


import java.lang.reflect.Method;

public class CustomAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> cls = TaskManager.class;

            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("  Assigned To: " + taskInfo.assignedTo());
                    System.out.println("  Priority: " + taskInfo.priority());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}