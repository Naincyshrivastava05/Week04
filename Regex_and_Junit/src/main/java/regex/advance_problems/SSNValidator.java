package regex.advance_problems;

import java.util.regex.*;

public class SSNValidator {
    // Regex pattern for SSN format (XXX-XX-XXXX)
    private static final String SSN_PATTERN = "^(\\d{3}-\\d{2}-\\d{4})$";

    public static boolean isValidSSN(String ssn) {
        return ssn.matches(SSN_PATTERN);
    }

    public static void main(String[] args) {
        String[] testSSNs = {
                "123-45-6789",  // Valid
                "987-65-4321",  // Valid
                "123456789",    // Invalid (missing dashes)
                "12-345-6789",  // Invalid (wrong format)
                "123-456-789"   // Invalid (wrong format)
        };

        for (String ssn : testSSNs) {
            System.out.println("\"" + ssn + "\" is " + (isValidSSN(ssn) ? "Valid" : "Invalid"));
        }
    }
}
