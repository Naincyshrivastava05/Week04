import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class IntegerDevision {
    public static double devision(int num, int den){
        int result = 0;
        try {
             result = num / den;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            throw e;
        }
        finally {
            System.out.println("Operation Completed");
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        int num = sc.nextInt();
        System.out.println("Enter Denomenator");
        int den = sc.nextInt();
        System.out.println(devision(num, den));
    }

}
