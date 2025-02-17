package junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataBaseConnectionTest {
    @Test
    public void testConnected(){
        DataBaseConnection.connect();
        assertTrue(DataBaseConnection.isConnect());
    }
    @Test
    public void testDisconnection(){
        DataBaseConnection.disconnect();
        assertFalse(DataBaseConnection.isConnect());
    }

}
