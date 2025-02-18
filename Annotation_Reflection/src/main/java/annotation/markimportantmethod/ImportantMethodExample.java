package annotation.markimportantmethod;
import annotation.customannotation.TaskManager;

import java.lang.reflect.Method;

public class ImportantMethodExample {

    public static void main(String[] args) {
        Class<?> cls = TaskManager.class;
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("Important Methods:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
            }
        }
    }
}