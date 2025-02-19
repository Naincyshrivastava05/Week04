package reflaction.advancelevel.methodexecutiontiming;



import java.lang.reflect.Method;

public class MethodExecutionTimer {

    public static void measureExecutionTime(Object obj, String methodName, Object... args) {
        try {
            Class<?> clazz = obj.getClass();

            Method method = null;
            for (Method m : clazz.getDeclaredMethods()) {
                if (m.getName().equals(methodName) && m.getParameterCount() == args.length) {
                    method = m;
                    break;
                }
            }

            if (method == null) {
                System.out.println("Method not found: " + methodName);
                return;
            }

            method.setAccessible(true);

            long startTime = System.nanoTime();
            Object result = method.invoke(obj, args);
            long endTime = System.nanoTime();

            System.out.println("Execution time for " + methodName + ": " + (endTime - startTime) / 1000000.0 + " ms");

            if (result != null) {
                System.out.println("Method Result: " + result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
