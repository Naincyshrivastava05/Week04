import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    private static final String TEST_FILE = "test_word_count.txt";

    @BeforeEach
    void setUp() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE))) {
            writer.write("hello world hello test\n");
            writer.write("test world world hello\n");
            writer.write("java test code java hello\n");
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testCountWords() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        WordCount.countWords(TEST_FILE);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertTrue(output.contains("hello: 3"));
        assertTrue(output.contains("world: 3"));
        assertTrue(output.contains("test: 3"));
        assertTrue(output.contains("java: 2"));
    }
}
