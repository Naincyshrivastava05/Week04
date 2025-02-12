package queue;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryNumberGeneratorTest {
    @Test
    void testGenerateBinaryNumbers() {
        List<String> result = BinaryNumberGenerator.generateBinaryNumbers(5);
        assertEquals(List.of("1", "10", "11", "100", "101"), result);
    }

    @Test
    void testGenerateBinaryNumbersSingle() {
        List<String> result = BinaryNumberGenerator.generateBinaryNumbers(1);
        assertEquals(List.of("1"), result);
    }

    @Test
    void testGenerateBinaryNumbersTen() {
        List<String> result = BinaryNumberGenerator.generateBinaryNumbers(10);
        assertEquals(List.of("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010"), result);
    }
}
