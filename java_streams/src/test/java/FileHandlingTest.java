import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {
    private static final String SOURCE_FILE = "source.txt";
    private static final String DESTINATION_FILE = "destination.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (FileWriter writer = new FileWriter(SOURCE_FILE)) {
            writer.write("Hello, this is a test file.");
        }
    }

    @AfterEach
    void tearDown() {
        new File(SOURCE_FILE).delete();
        new File(DESTINATION_FILE).delete();
    }

    @Test
    void testCopyFileSuccess() {
        FileHandling.copyFile(SOURCE_FILE, DESTINATION_FILE);
        File destination = new File(DESTINATION_FILE);
        assertTrue(destination.exists(), "Destination file should exist after copying");

        try (BufferedReader reader = new BufferedReader(new FileReader(DESTINATION_FILE))) {
            String content = reader.readLine();
            assertEquals("Hello, this is a test file.", content, "File content should match");
        } catch (IOException e) {
            fail("Exception occurred while reading the copied file: " + e.getMessage());
        }
    }


}

