package set_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SymmetricDifferenceTest {
    @Test
    public void testSymmetricDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    public void testNoDifference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> expected = new HashSet<>();
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    public void testWithEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        assertEquals(set1, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    public void testCompletelyDifferentSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }
}

