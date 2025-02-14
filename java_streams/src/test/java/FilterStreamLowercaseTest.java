import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FilterStreamLowercaseTest {
    private static final String TEST_INPUT = "test_input.txt";
    private static final String TEST_OUTPUT = "test_output.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_INPUT))) {
            writer.write("HELLO WORLD\nThis Is A Test\nJUnit Testing");
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_INPUT).delete();
        new File(TEST_OUTPUT).delete();
    }

    @Test
    void testConvertToLowercase() throws IOException {
        FilterStreamLowercase.convertToLowercase(TEST_INPUT, TEST_OUTPUT);

        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_OUTPUT))) {
            assertEquals("hello world", reader.readLine());
            assertEquals("this is a test", reader.readLine());
            assertEquals("junit testing", reader.readLine());
            assertNull(reader.readLine(), "File should have exactly three lines");
        }
    }
}
