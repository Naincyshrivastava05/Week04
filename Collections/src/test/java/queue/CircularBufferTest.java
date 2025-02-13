package queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircularBufferTest {
    CircularBuffer cb;
    @BeforeEach
    public void initialize(){
         cb = new CircularBuffer(5);
    }
    @Test
    public void overrrideArray(){
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.insert(5);
        cb.insert(6);
        cb.insert(7);
        int[] ans = {3,4,5,6,7};
        int[] compare = cb.getbuffer();

        assertEquals(ans,compare);

    }
    @Test
    public void fullArray(){
        CircularBuffer   cb2 = new CircularBuffer(5);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.insert(5);
        assertEquals(true, cb.isFull());
    }

    @Test
    public void emptyArray(){
        CircularBuffer  cb3 = new CircularBuffer(0);
        assertEquals(true, cb.isEmpty());
    }

}
