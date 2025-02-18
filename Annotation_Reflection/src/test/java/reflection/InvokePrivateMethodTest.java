package reflection;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

import reflaction.basiclevel.invokeprivatemethods.Calculator;


public class InvokePrivateMethodTest {

    @Test
    public void testMultiplyMethod() throws Exception {
        Calculator calculator = new Calculator();

        Class<?> cls = calculator.getClass();

        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(calculator, 5, 4);

        assertEquals(20, result);
    }
}