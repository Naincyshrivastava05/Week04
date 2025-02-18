package annotation.customcachingsystem;


public class ExpensiveComputationImpl implements ExpensiveComputation {
    @Override
    public long factorial(int n) {
        System.out.println("Computing factorial for: " + n);
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}