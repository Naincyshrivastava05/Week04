import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerDevisionTest {
    @Test
    public void exceptionCheck(){
        assertThrows(ArithmeticException.class,()->IntegerDevision.devision(12,0));
    }
    @Test
    public void outputCheck(){
        assertEquals(5,IntegerDevision.devision(10,2));
    }
}
