package regex;

import java.util.regex.*;
import java.util.*;

public class DateExtractor {
    // Regex pattern to match dd/mm/yyyy format
    private static final String DATE_PATTERN = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        List<String> dates = extractDates(text);
        System.out.println("Extracted Dates:");
        System.out.println(String.join(", ", dates));
    }
}

