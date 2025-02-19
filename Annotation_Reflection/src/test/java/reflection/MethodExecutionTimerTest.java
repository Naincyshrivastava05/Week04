package reflection;

import org.junit.jupiter.api.Test;
import reflaction.advancelevel.methodexecutiontiming.MathOperations;
import reflaction.advancelevel.methodexecutiontiming.MethodExecutionTimer;


import static org.junit.jupiter.api.Assertions.*;

public class MethodExecutionTimerTest {

    @Test
    public void testExecutionTime() {
        MathOperations mathOperations = new MathOperations();
        assertDoesNotThrow(() -> MethodExecutionTimer.measureExecutionTime(mathOperations, "fastMethod"));
        assertDoesNotThrow(() -> MethodExecutionTimer.measureExecutionTime(mathOperations, "slowMethod"));
        assertDoesNotThrow(() -> MethodExecutionTimer.measureExecutionTime(mathOperations, "add", 5, 10));
    }
}