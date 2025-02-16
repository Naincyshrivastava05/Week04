package regex;

import java.util.Scanner;
public class UserNameValidator {
    // Regular expression pattern for username validation
    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
    // Method to validate the username
    public static boolean isValidUsername(String username) {
        return username.matches(USERNAME_PATTERN);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        // Validating the username
        if (isValidUsername(username)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }

        scanner.close();
    }
}
