package junit.advanceJunit;


import java.util.regex.Pattern;

public class UserRegistration {

    public static void registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

        System.out.println("User registered successfully!");
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    public static void main(String[] args) {
        registerUser("Abhishek", "rajabhishek@gmail.com", "password123");
        registerUser("Muskan", "invalid-email", "password123");
    }
}