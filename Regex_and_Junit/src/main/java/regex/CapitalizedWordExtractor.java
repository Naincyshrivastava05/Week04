package regex;

import java.util.regex.*;
import java.util.*;

public class CapitalizedWordExtractor {
    // Regex pattern for capitalized words
    private static final String CAPITALIZED_WORD_PATTERN = "\\b[A-Z][a-z]*\\b";

    public static List<String> extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();
        Pattern pattern = Pattern.compile(CAPITALIZED_WORD_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        List<String> capitalizedWords = extractCapitalizedWords(text);
        System.out.println("Extracted Capitalized Words:");
        System.out.println(String.join(", ", capitalizedWords));
    }
}
