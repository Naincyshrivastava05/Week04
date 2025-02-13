package map_interface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MapInverterTest {
    @Test
    void testInvertMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Arrays.asList("A", "C"));
        expectedOutput.put(2, Collections.singletonList("B"));

        Map<Integer, List<String>> actualOutput = MapInverter.invertMap(inputMap);

        assertEquals(expectedOutput.keySet(), actualOutput.keySet());

    }

    @Test
    void testInvertMapEmpty() {
        Map<String, Integer> inputMap = new HashMap<>();
        Map<Integer, List<String>> actualOutput = MapInverter.invertMap(inputMap);
        assertTrue(actualOutput.isEmpty());
    }

    @Test
    void testInvertMapSingleEntry() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Collections.singletonList("A"));

        Map<Integer, List<String>> actualOutput = MapInverter.invertMap(inputMap);

        assertEquals(expectedOutput, actualOutput);
    }
}

