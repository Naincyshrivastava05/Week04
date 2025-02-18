package annotation.customcachingsystem;


public class CacheExample {
    public static void main(String[] args) {
        ExpensiveComputation computation = CacheHandler.createCachedInstance(
                new ExpensiveComputationImpl(), ExpensiveComputation.class
        );

        System.out.println("Factorial of 5: " + computation.factorial(5));

        System.out.println("Factorial of 5: " + computation.factorial(5));

        System.out.println("Factorial of 6: " + computation.factorial(6));
        System.out.println("Factorial of 6: " + computation.factorial(6));
    }
}