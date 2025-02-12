package list_interface;

import java.util.*;

public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            first.next();
        }

        // Move both pointers until the first pointer reaches the end
        String nthFromEnd = null;
        while (first.hasNext()) {
            first.next();
            nthFromEnd = second.next();
        }

        return nthFromEnd;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        System.out.println(findNthFromEnd(list, N)); // Output: D
    }
}
