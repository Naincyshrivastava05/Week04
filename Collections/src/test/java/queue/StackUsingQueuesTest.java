package queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackUsingQueuesTest {
    private StackUsingQueues stack;

    @BeforeEach
    void setUp() {
        stack = new StackUsingQueues();
    }

    @Test
    void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testTop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.top());
        stack.pop();
        assertEquals(10, stack.top());
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopEmptyStack() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            stack.pop();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    void testTopEmptyStack() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            stack.top();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }
}
