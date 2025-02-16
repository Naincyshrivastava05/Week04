package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class DateExtractorTest {

    @Test
    void testExtractValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = DateExtractor.extractDates(text);

        assertEquals(3, dates.size());
        assertTrue(dates.contains("12/05/2023"));
        assertTrue(dates.contains("15/08/2024"));
        assertTrue(dates.contains("29/02/2020"));  // Leap year date
    }

    @Test
    void testNoDates() {
        String text = "No valid dates here, just some text.";
        List<String> dates = DateExtractor.extractDates(text);

        assertTrue(dates.isEmpty());
    }

    @Test
    void testInvalidDates() {
        String text = "Invalid dates: 32/05/2023, 15/13/2024, 00/02/2020.";
        List<String> dates = DateExtractor.extractDates(text);

        assertTrue(dates.isEmpty());  // These should not be extracted
    }
}
