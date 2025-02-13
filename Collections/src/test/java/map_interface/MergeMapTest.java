package map_interface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MergeMapTest {
    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("A", 1);
        expectedOutput.put("B", 5);
        expectedOutput.put("C", 4);

        assertEquals(expectedOutput, MergeMap.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsEmptyFirst() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 2);
        map2.put("B", 3);

        assertEquals(map2, MergeMap.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsEmptySecond() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 2);
        map1.put("B", 3);
        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(map1, MergeMap.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsBothEmpty() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(MergeMap.mergeMaps(map1, map2).isEmpty());
    }
}

