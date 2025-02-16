package regex;

import java.util.regex.*;

public class CensorBadWords {
    // List of bad words (can be extended)
    private static final String[] BAD_WORDS = {"damn", "stupid"};

    public static String censorText(String text) {
        for (String word : BAD_WORDS) {
            String regex = "\\b" + word + "\\b"; // Match whole words only
            text = text.replaceAll(regex, "****");
        }
        return text;
    }

    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String output = censorText(input);

        System.out.println("Original: " + input);
        System.out.println("Censored: " + output);
    }
}
