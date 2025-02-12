package set_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class EqualityCheckerTest {
    @Test
    public void testEqualSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(EqualityChecker.areSetsEqual(set1, set2));
    }

    @Test
    public void testDifferentSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 4));
        assertFalse(EqualityChecker.areSetsEqual(set1, set2));
    }

    @Test
    public void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        assertTrue(EqualityChecker.areSetsEqual(set1, set2));
    }

    @Test
    public void testDifferentSizes() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertFalse(EqualityChecker.areSetsEqual(set1, set2));
    }
}

