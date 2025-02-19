package reflaction.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Class<?> cls = Class.forName("reflection.dynamicmethodinvocation.MathOperations");
            Object obj = cls.getDeclaredConstructor().newInstance();

            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            Method method = cls.getMethod(methodName, int.class, int.class);

            Object result = method.invoke(obj, num1, num2);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
