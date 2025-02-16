package regex;
import java.util.Scanner;

public class LicensePlateValidator {
    // Regex pattern for license plate validation
    private static final String LICENSE_PLATE_PATTERN = "^[A-Z]{2}\\d{4}$";

    // Method to validate the license plate number
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches(LICENSE_PLATE_PATTERN);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a license plate number: ");
        String plate = scanner.nextLine();

        // Validating the license plate
        if (isValidLicensePlate(plate)) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }

        scanner.close();
    }
}
