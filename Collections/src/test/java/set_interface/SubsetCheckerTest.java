package set_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SubsetCheckerTest {
    @Test
    public void testSubset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(SubSetChecker.isSubset(set1, set2));
    }

    @Test
    public void testNotSubset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(SubSetChecker.isSubset(set1, set2));
    }

    @Test
    public void testEmptySetIsSubset() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(SubSetChecker.isSubset(set1, set2)); // Empty set is always a subset
    }

    @Test
    public void testSameSet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(SubSetChecker.isSubset(set1, set2));
    }

    @Test
    public void testLargerSetNotSubset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(SubSetChecker.isSubset(set1, set2));
    }
}
