package queue;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

public class QueueReverseTest {
    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        QueueReverser.reverseQueue(queue);

        assertEquals(30, queue.remove());
        assertEquals(20, queue.remove());
        assertEquals(10, queue.remove());
        assertTrue(queue.isEmpty());
    }
}
