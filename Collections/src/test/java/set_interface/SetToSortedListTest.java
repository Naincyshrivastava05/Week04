package set_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SetToSortedListTest {
    @Test
    public void testSortedList() {
        
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> expected = Arrays.asList(1, 3, 5, 9);
        assertEquals(expected, SetToSortedList.convertToSortedList(set));
    }

    @Test
    public void testEmptySet() {
        Set<Integer> set = new HashSet<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, SetToSortedList.convertToSortedList(set));
    }

    @Test
    public void testAlreadySortedSet() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, SetToSortedList.convertToSortedList(set));
    }

    @Test
    public void testReverseOrderedSet() {
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 8, 6, 4, 2));
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        assertEquals(expected, SetToSortedList.convertToSortedList(set));
    }
}
