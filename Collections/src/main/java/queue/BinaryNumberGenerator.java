package queue;

import java.util.*;

public class BinaryNumberGenerator {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String binary = queue.remove(); // Remove front element
            result.add(binary); // Store in result list

            queue.add(binary + "0"); // Append "0" and enqueue
            queue.add(binary + "1"); // Append "1" and enqueue
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("First " + N + " Binary Numbers: " + generateBinaryNumbers(N));
    }
}

