package set_interface;

import java.util.*;

public class SetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set); // Convert set to list
        Collections.sort(sortedList); // Sort in ascending  order
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(convertToSortedList(set)); // Output: [1, 3, 5, 9]
    }
}
