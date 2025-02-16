package regex;

import java.util.regex.*;
import java.util.*;

public class LinkExtractor {
    // Regex pattern to match URLs
    private static final String URL_PATTERN = "https?://(www\\\\.)?([a-zA-Z0-9.-]+)";

    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Pattern pattern = Pattern.compile(URL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        List<String> links = extractLinks(text);
        System.out.println("Extracted Links:");
        System.out.println(String.join(", ", links));
    }
}
