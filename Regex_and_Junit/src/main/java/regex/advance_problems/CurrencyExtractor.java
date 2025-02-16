package regex.advance_problems;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {
    public static List<String> extractCurrencyValues(String text) {
        List<String> currencyValues = new ArrayList<>();

        // Regex pattern to match currency values (e.g., "$45.99", "10.50")
        String regex = "\\$?\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        List<String> values = extractCurrencyValues(text);
        System.out.println("Extracted Currency Values: " + String.join(", ", values));
    }
}

