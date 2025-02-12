package list_interface;

    import java.util.*;

    public class FrequencyCount{
        public static Map<String, Integer> countFrequency(List<String> elements) {
            Map<String, Integer> frequencyMap = new HashMap<>();
            for (String element : elements) {
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            }
            return frequencyMap;
        }

        public static void main(String[] args) {
            List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
            System.out.println(countFrequency(input));
        }
    }

