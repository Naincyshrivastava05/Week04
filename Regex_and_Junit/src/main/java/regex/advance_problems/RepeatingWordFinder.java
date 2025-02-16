package regex.advance_problems;

import java.util.*;
import java.util.regex.*;

public class RepeatingWordFinder {
    public static Set<String> findRepeatingWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        Set<String> repeatingWords = new HashSet<>();

        // Regex to extract words (ignores punctuation)
        String regex = "\\b(\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group().toLowerCase(); // Convert to lowercase for case insensitivity
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            if (wordCount.get(word) > 1) {
                repeatingWords.add(word);
            }
        }

        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        Set<String> repeatingWords = findRepeatingWords(text);
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));
    }
}
