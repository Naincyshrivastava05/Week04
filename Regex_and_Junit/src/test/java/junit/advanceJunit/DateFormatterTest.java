package junit.advanceJunit;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDateConversion() {
        assertEquals("20-06-2024", DateFormatter.formatDate("2024-06-20"));
        assertEquals("05-01-2023", DateFormatter.formatDate("2023-01-05"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("20-06-2024");
        });

        assertEquals("Invalid date format. Expected format: yyyy-MM-dd", exception.getMessage());
    }

    @Test
    void testInvalidDateValue() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("2024-2-30");
        });

        assertEquals("Invalid date format. Expected format: yyyy-MM-dd", exception.getMessage());
    }
}
