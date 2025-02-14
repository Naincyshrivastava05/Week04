import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class PipedStreamsInterThreadTest {

    @Test
    void testPipedStreamCommunication() throws IOException, InterruptedException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writerThread = new Thread(() -> {
            try (DataOutputStream dos = new DataOutputStream(pos)) {
                dos.writeUTF("Test Message");
            } catch (IOException e) {
                fail("Writer thread failed: " + e.getMessage());
            }
        });

        Thread readerThread = new Thread(() -> {
            try (DataInputStream dis = new DataInputStream(pis)) {
                String message = dis.readUTF();
                assertEquals("Test Message", message);
            } catch (IOException e) {
                fail("Reader thread failed: " + e.getMessage());
            }
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();
    }
}
