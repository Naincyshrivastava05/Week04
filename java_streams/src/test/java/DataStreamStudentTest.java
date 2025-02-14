import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class DataStreamsStudentTest {
    private static final String TEST_FILE = "test_student_data.dat";

    @BeforeEach
    void setUp() {
        new File(TEST_FILE).delete();
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testStoreAndRetrieveStudentData() throws IOException {
        int expectedRollNumber = 101;
        String expectedName = "Alice";
        double expectedGPA = 3.8;

        DataStreamStudent.storeStudentData(TEST_FILE, expectedRollNumber, expectedName, expectedGPA);

        try (DataInputStream dis = new DataInputStream(new FileInputStream(TEST_FILE))) {
            assertEquals(expectedRollNumber, dis.readInt());
            assertEquals(expectedName, dis.readUTF());
            assertEquals(expectedGPA, dis.readDouble(), 0.001);
        }
    }
}
