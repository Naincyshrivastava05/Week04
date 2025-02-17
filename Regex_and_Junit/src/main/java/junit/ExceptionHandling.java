package junit;

public class ExceptionHandling {
    public static int devide(int a, int b)throws ArithmeticException{
        try{
            int result = a/b;
            return result;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        System.out.println(devide(10,5));
    }
}
