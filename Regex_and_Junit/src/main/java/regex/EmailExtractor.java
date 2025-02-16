package regex;

import java.util.regex.*;
import java.util.*;

public class EmailExtractor{
    // Regex pattern for extracting emails
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for inquiries.";

        List<String> emails = extractEmails(text);
        System.out.println("Extracted Email Addresses:");
        emails.forEach(System.out::println);
    }
}

