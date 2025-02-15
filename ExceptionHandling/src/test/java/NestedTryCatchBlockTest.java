import  org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class NestedTryCatchBlockTest {
    @Test
    public void arrayIndexOutOfBoundException(){
        int[] arr = {10,20,30,40,50};
        assertThrows(ArrayIndexOutOfBoundsException.class,()->NestedTryCatchBlock.nestedTry(arr, 7, 5));
    }
    @Test
    public void arithmeticException(){
        int[] arr = {10,20,30};
        assertThrows(ArithmeticException.class,()->NestedTryCatchBlock.nestedTry(arr,2,0));
    }
}
