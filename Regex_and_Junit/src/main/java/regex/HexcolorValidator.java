package regex;

import java.util.Scanner;

public class HexcolorValidator {
    // Regex pattern for hex color validation
    private static final String HEX_COLOR_PATTERN = "^#([A-Fa-f0-9]{6})$";

    // Method to validate the hex color
    public static boolean isValidHexColor(String color) {
        return color.matches(HEX_COLOR_PATTERN);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a hex color code: ");
        String color = scanner.nextLine();

        // Validating the hex color code
        if (isValidHexColor(color)) {
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }

        scanner.close();
    }
}
