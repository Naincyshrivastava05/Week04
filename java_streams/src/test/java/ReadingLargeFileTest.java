import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class ReadLargeFileTest {
    private static final String TEST_FILE = "test_large_file.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE))) {
            writer.write("This is a test line\n");
            writer.write("Error: Something went wrong\n");
            writer.write("Another normal line\n");
            writer.write("Critical ERROR detected\n");
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testReadErrorLines() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ReadLargeFile.readErrorLines(TEST_FILE);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Error: Something went wrong"));
        assertTrue(output.contains("Critical ERROR detected"));
    }
}
