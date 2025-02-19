package reflaction.advancelevel.methodexecutiontiming;


public class MethodTimingTest {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        MethodExecutionTimer.measureExecutionTime(mathOperations, "fastMethod");
        MethodExecutionTimer.measureExecutionTime(mathOperations, "slowMethod");
        MethodExecutionTimer.measureExecutionTime(mathOperations, "add", 10, 20);
    }
}
