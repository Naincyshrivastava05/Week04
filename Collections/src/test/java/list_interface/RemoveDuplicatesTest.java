package list_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);

        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testSingleElementList() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);

        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testAllDuplicates() {
        List<Integer> input = Arrays.asList(2, 2, 2, 2);
        List<Integer> expected = Arrays.asList(2);

        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    public void testNoDuplicates() {
        List<Integer> input = Arrays.asList(4, 5, 6, 7);
        List<Integer> expected = Arrays.asList(4, 5, 6, 7);

        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }
}
