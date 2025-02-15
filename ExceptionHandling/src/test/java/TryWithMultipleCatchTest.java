import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TryWithMultipleCatchTest {
    @Test
    public void nullPointerException(){
        int arr[] =  {};
        assertThrows(NullPointerException.class,()-> TryWithMultipleCatch.multipleCatch(arr,1));
    }
    @Test
    public  void indexOutOfBoundExp(){
        int[] arr = {10,20,30};
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> TryWithMultipleCatch.multipleCatch(arr,4));
    }
    @Test
    public void validIndex(){
        int[] arr ={1,2,3,4};
        assertDoesNotThrow(()-> TryWithMultipleCatch.multipleCatch(arr,2));
    }
    
}
