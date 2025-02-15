import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UncheckedExceptionTest {

    @Test
    void testValidDivision(){
        assertEquals(5, UncheckedException.divide(10, 2));
        assertEquals(2, UncheckedException.divide(8, 4));
        assertEquals(0, UncheckedException.divide(0, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            UncheckedException.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}

