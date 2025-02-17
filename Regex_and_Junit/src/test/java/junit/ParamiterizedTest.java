package junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ParamiterizedTest {
    @Test
    public void testeven(){
        assertTrue(Paramiterized.isEven(2));
        assertTrue(Paramiterized.isEven(98));
        assertFalse(Paramiterized.isEven(5));
    }
}
