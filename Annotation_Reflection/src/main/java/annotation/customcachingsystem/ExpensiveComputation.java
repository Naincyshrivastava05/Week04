package annotation.customcachingsystem;



public interface ExpensiveComputation {
    @CacheResult
    long factorial(int n);
}
