package list_interface;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            if (seen.add(num)) { // Only add if it's not already in the set
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(input)); // Output: [3, 1, 2, 4]
    }
}
