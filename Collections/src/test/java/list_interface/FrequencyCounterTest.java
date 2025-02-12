package list_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class FrequencyCounterTest {
    @Test
    public void testCountFrequency() {
        //testing
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        assertEquals(expected, FrequencyCount.countFrequency(input));
    }

    @Test
    public void testEmptyList() {
        List<String> input = new ArrayList<>();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, FrequencyCount.countFrequency(input));
    }

    @Test
    public void testSingleElementList() {
        List<String> input = Arrays.asList("apple");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);

        assertEquals(expected, FrequencyCount.countFrequency(input));
    }

    @Test
    public void testMultipleSameElements() {
        List<String> input = Arrays.asList("banana", "banana", "banana");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("banana", 3);

        assertEquals(expected, FrequencyCount.countFrequency(input));
    }
}

