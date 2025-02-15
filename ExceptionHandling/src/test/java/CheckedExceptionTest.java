import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckedExceptionTest {
    private static final String TEST_FILE = "test_data.txt";

    @BeforeEach
    void setUp() throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE))) {
            writer.write("Hello, this is a test file.\n");
            writer.write("Reading file content in Java.\n");
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testFileExists() throws IOException {
        String content = CheckedException.readFile(TEST_FILE);
        assertEquals("Hello, this is a test file.\nReading file content in Java.", content);
    }

    @Test
    void testFileNotFound(){
        new File(TEST_FILE).delete(); // Ensure file does not exist

        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            CheckedException.readFile(TEST_FILE);
        });

        assertTrue(exception.getMessage().contains(TEST_FILE));
    }
}
