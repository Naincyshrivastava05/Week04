import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationMain {
    @Test
    public void exceptionCheck(){
        assertThrows(ArithmeticException.class,()->ExceptionPropagation.method2(2,0));
    }
    @Test
    public void outputCheck(){
        assertEquals(5,ExceptionPropagation.method2(10,2));
    }
}
