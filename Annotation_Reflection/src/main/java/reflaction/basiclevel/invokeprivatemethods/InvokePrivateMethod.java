package reflaction.basiclevel.invokeprivatemethods;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        Class<?> cls = calculator.getClass();
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);

        int result = (int) method.invoke(calculator,2,3);
        System.out.println("Multiplication result: "+ result);
    }
}
