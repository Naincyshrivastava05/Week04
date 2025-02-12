package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        // Step 1: Remove the front element
        int front = queue.remove();

        // Step 2: Recursively reverse the remaining queue
        reverseQueue(queue);

        // Step 3: Add the removed element back to the queue
        queue.add(front);
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
