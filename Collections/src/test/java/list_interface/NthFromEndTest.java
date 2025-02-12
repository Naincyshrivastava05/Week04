package list_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class NthFromEndTest {
    @Test
    public void testFindNthFromEnd() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        assertEquals("D", NthFromEnd.findNthFromEnd(list, 2));
    }

    @Test
    public void testFindFirstFromEnd() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        assertEquals("E", NthFromEnd.findNthFromEnd(list, 1));
    }

    @Test
    public void testFindLastFromEnd() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        assertEquals("A", NthFromEnd.findNthFromEnd(list, 5));
    }

    @Test
    public void testNGreaterThanSize() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        assertThrows(IllegalArgumentException.class, () -> NthFromEnd.findNthFromEnd(list, 4));
    }

    @Test
    public void testEmptyList() {
        LinkedList<String> list = new LinkedList<>();
        assertThrows(IllegalArgumentException.class, () -> NthFromEnd.findNthFromEnd(list, 1));
    }

    @Test
    public void testNegativeN() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        assertThrows(IllegalArgumentException.class, () -> NthFromEnd.findNthFromEnd(list, -1));
    }
}
