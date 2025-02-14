import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class UserInputToFileTest {
    private static final String TEST_FILE = "user_data.txt";

    @BeforeEach
    void setUp() {
        new File(TEST_FILE).delete();
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testWriteUserInputToFile() {
        try (FileWriter writer = new FileWriter(TEST_FILE)) {
            writer.write("Name: Naincy Shrivastava\n");
            writer.write("Age: 22\n");
            writer.write("Favorite Language: Java\n");
            writer.write("----------------------\n");
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }

        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "Test file should exist after writing");

        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE))) {
            assertEquals("Name: Naincy Shrivastava", reader.readLine());
            assertEquals("Age: 22", reader.readLine());
            assertEquals("Favorite Language: Java", reader.readLine());
        } catch (IOException e) {
            fail("IOException occurred while reading the file: " + e.getMessage());
        }
    }
}
