import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException{
    public static int divide(int numerator, int denominator) {
        int result = 0;
        try {
        result = numerator/denominator;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); 
        }

    return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator=0, denominator=0;
            try {
                System.out.print("Enter the numerator: ");
                numerator = scanner.nextInt();

                System.out.print("Enter the denominator: ");
                denominator = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
            }

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

    }
}
