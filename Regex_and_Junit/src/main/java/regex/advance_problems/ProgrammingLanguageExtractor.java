package regex.advance_problems;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ProgrammingLanguageExtractor {
    // List of common programming languages
    private static final List<String> LANGUAGES = Arrays.asList(
            "Java", "Python", "JavaScript", "C", "C++", "C#", "Go", "Swift",
            "Kotlin", "Ruby", "PHP", "Rust", "TypeScript", "Perl", "Scala"
    );

    public static List<String> extractProgrammingLanguages(String text) {
        List<String> extractedLanguages = new ArrayList<>();

        for (String language : LANGUAGES) {
            String regex = "\\b" + language + "\\b";  // Match whole words only
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                extractedLanguages.add(language);
            }
        }
        return extractedLanguages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        List<String> languages = extractProgrammingLanguages(text);
        System.out.println("Extracted Languages: " + String.join(", ", languages));
    }
}
