package regex.advance_problems;

import java.util.regex.*;

public class CreditCardValidator {
    // Regex patterns for Visa and MasterCard
    private static final String VISA_PATTERN = "^4[0-9]{15}$";  // Starts with 4, has 16 digits
    private static final String MASTERCARD_PATTERN = "^5[1-5][0-9]{14}$";  // Starts with 51-55, has 16 digits

    public static String validateCreditCard(String cardNumber) {
        if (cardNumber.matches(VISA_PATTERN)) {
            return "Valid Visa Card";
        } else if (cardNumber.matches(MASTERCARD_PATTERN)) {
            return "Valid MasterCard";
        } else {
            return "Invalid Card Number";
        }
    }

    public static void main(String[] args) {
        String[] testCards = {
                "4111111111111111",  // Visa (Valid)
                "5105105105105100",  // MasterCard (Valid)
                "5200000000000000",  // MasterCard (Valid)
                "4000000000000",     // Invalid (too short)
                "6011111111111117"   // Invalid (not Visa or MasterCard)
        };

        for (String card : testCards) {
            System.out.println(card + " → " + validateCreditCard(card));
        }
    }
}
