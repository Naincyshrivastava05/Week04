import java.util.Scanner;

public class IntrestCalculator {
    public static double intrestCalculator(double amount , double rate, int year) throws IllegalArgumentException{
        double result = 0;
        if(amount<0|| rate<0){
            result = -1;
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
      else {
            result = (amount * rate * year) / 100;
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        System.out.println("Enter rate");
        int rate = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        try{
            double intrest = intrestCalculator(amount, rate,year);
            System.out.println("Calculated Intrest:-"+intrest);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid input"+e.getMessage());
            throw e;
        }
    }
}
