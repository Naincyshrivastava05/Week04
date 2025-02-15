import java.util.Scanner;

public class ExceptionPropagation {
    public static double method1(int num ,int den)throws ArithmeticException{
        if(den == 0){
            throw new ArithmeticException("Devide by zero");
        }
        return num/den;
    }
    public static double method2(int num, int den) throws ArithmeticException{
        return method1(num,den);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
     int num =    sc.nextInt();
        System.out.println("Enter denominator");
        int den = sc.nextInt();
        try {
            System.out.println(method2(num,den));
        }catch (ArithmeticException e){
            System.out.println("Handled Exception in main");
            throw e;
        }
    }
}
