import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.*;

class ImageByteArrayStreamTest{
    private static final String TEST_IMAGE = "c:user/picutes/test_input.jpg";
    private static final String OUTPUT_IMAGE = "c:user/picutes/test_output.jpg";

    @BeforeEach
    void setUp() throws IOException {
        // Create a test image file
        Files.write(new File(TEST_IMAGE).toPath(), new byte[]{1, 2, 3, 4, 5});
    }

    @AfterEach
    void tearDown() {
        new File(TEST_IMAGE).delete();
        new File(OUTPUT_IMAGE).delete();
    }

    @Test
    void testImageConversion() throws IOException {
        byte[] imageData = ImageByteArrayStream.convertImageToByteArray(TEST_IMAGE);
        assertNotNull(imageData, "Byte array should not be null");
        assertEquals(5, imageData.length, "Byte array size should match the original file");

        ImageByteArrayStream.writeByteArrayToImage(imageData, OUTPUT_IMAGE);
        File outputFile = new File(OUTPUT_IMAGE);
        assertTrue(outputFile.exists(), "Output file should exist after writing");

        byte[] outputData = Files.readAllBytes(outputFile.toPath());
        assertArrayEquals(imageData, outputData, "Output image data should match input");
    }
}
