package reflection;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicMethodInvocationTest {

    @Test
    public void testDynamicMethodInvocation() throws Exception {
        Class<?> cls = Class.forName("reflection.dynamicmethodinvocation.MathOperations");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method addMethod = cls.getMethod("add", int.class, int.class);
        Object addResult = addMethod.invoke(obj, 5, 3);
        assertEquals(8, addResult);

        Method subtractMethod = cls.getMethod("subtract", int.class, int.class);
        Object subtractResult = subtractMethod.invoke(obj, 10, 4);
        assertEquals(6, subtractResult);

        Method multiplyMethod = cls.getMethod("multiply", int.class, int.class);
        Object multiplyResult = multiplyMethod.invoke(obj, 2, 5);
        assertEquals(10, multiplyResult);
    }
}