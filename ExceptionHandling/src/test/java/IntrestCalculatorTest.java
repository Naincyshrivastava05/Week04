import  org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;
public class IntrestCalculatorTest {
    @Test
    public void checkException(){
        assertThrows(IllegalArgumentException.class,()->IntrestCalculator.intrestCalculator(1000,-1,2));

    }
    @Test
    public  void calculateIntrest(){
        assertEquals(1000,IntrestCalculator.intrestCalculator(10000,2,5));
    }
}
