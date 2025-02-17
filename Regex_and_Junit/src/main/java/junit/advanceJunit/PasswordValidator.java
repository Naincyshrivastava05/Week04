package junit.advanceJunit;


public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        System.out.println("Password123: " + isValidPassword("Password123"));
        System.out.println("pass123: " + isValidPassword("pass123"));
        System.out.println("PASSWORD: " + isValidPassword("PASSWORD"));
        System.out.println("password: " + isValidPassword("password"));
        System.out.println("P@ssword1: " + isValidPassword("P@ssword1"));
    }
}