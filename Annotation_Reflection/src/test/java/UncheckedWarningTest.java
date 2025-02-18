
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class UncheckedWarningTest {

    @Test
    @SuppressWarnings("unchecked")
    void testArrayListRawType() {
        ArrayList list = new ArrayList<>();
        list.add("Test");
        list.add(123);


        assertEquals(2, list.size());
        assertEquals("Test", list.get(0));
        assertEquals(123, list.get(1));
    }
}