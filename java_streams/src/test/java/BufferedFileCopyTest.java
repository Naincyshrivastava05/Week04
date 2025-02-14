import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class BufferedFileCopyTest {
    private static final String SOURCE_FILE = "c:user/download/test_largefile.dat";
    private static final String DEST_BUFFERED = "c:user/download/test_largefile_buffered_copy.dat";
    private static final String DEST_UNBUFFERED = "c:user/download/test_largefile_unbuffered_copy.dat";

    @BeforeEach
    void setUp() throws IOException {
        try (FileOutputStream fos = new FileOutputStream(SOURCE_FILE)) {
            byte[] data = new byte[1024 * 1024]; // 1MB of data
            for (int i = 0; i < 100; i++) { // 100MB file
                fos.write(data);
            }
        }
    }

    @AfterEach
    void tearDown() {
        new File(SOURCE_FILE).delete();
        new File(DEST_BUFFERED).delete();
        new File(DEST_UNBUFFERED).delete();
    }

    @Test
    void testBufferedCopy() {
        long timeTaken = BufferedFileCopy.copyFileBuffered(SOURCE_FILE, DEST_BUFFERED);
        File destination = new File(DEST_BUFFERED);
        assertTrue(destination.exists(), "Buffered copy file should exist");
        assertTrue(destination.length() > 0, "Buffered copy file should not be empty");
        System.out.println("Buffered Copy Time: " + timeTaken + " ns");
    }

    @Test
    void testUnbufferedCopy() {
        long timeTaken = BufferedFileCopy.copyFileUnbuffered(SOURCE_FILE, DEST_UNBUFFERED);
        File destination = new File(DEST_UNBUFFERED);
        assertTrue(destination.exists(), "Unbuffered copy file should exist");
        assertTrue(destination.length() > 0, "Unbuffered copy file should not be empty");
        System.out.println("Unbuffered Copy Time: " + timeTaken + " ns");
    }
}
