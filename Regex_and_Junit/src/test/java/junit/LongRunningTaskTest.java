package junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class LongRunningTaskTest {
    @Test
    @Timeout(value = 2,unit= TimeUnit.SECONDS)
    public void testingLongRunningTask(){
        LongRunningTask.longRunningTask();
    }
}
