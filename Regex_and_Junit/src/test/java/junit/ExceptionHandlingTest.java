package junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ExceptionHandlingTest {
    @Test
    public  void devideByZero(){
        assertThrows(ArithmeticException.class,()-> ExceptionHandling.devide(3,0));
    }
    @Test
    public void output(){
        assertEquals(2,ExceptionHandling.devide(10,5));
    }
}
