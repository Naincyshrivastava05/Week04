package annotation.loggingmethodexecutiontime;

import java.lang.reflect.Method;

public class PerformanceLogger {

    public static void logExecutionTime(Object obj, String methodName, Object... args) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();

                method.invoke(obj, args);

                long endTime = System.nanoTime();
                long duration = endTime - startTime;

                System.out.println("Execution Time of " + methodName + ": " + duration / 1000000.0 + " ms");
            } else {
                System.out.println("Method " + methodName + " is not annotated with @LogExecutionTime.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}