package map_interface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MaxValueKeyFinderTest {
    @Test
    void testFindMaxKey() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        assertEquals("B", MaxValueKeyFinder.findMaxKey(inputMap));
    }

    @Test
    void testFindMaxKeyEmpty() {
        Map<String, Integer> inputMap = new HashMap<>();
        assertNull(MaxValueKeyFinder.findMaxKey(inputMap));
    }

    @Test
    void testFindMaxKeySingleEntry() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);

        assertEquals("A", MaxValueKeyFinder.findMaxKey(inputMap));
    }

    @Test
    void testFindMaxKeyMultipleMax() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 20);
        inputMap.put("B", 20);

        String result = MaxValueKeyFinder.findMaxKey(inputMap);
        assertTrue(result.equals("A") || result.equals("B"));
    }
}
