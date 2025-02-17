package junit;

package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class FileProcessorTest {
    private static final String testFile = "testfile.txt";

    @AfterEach
    void cleanUp() {
        try {
            Files.deleteIfExists(Paths.get(testFile));
        } catch (IOException e) {
            System.err.println("Failed to delete test file: " + e.getMessage());
        }
    }

    @Test
    void testWriteToFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(testFile, content);

        assertTrue(Files.exists(Paths.get(testFile)));
    }

    @Test
    void testReadFromFile() throws IOException {
        String content = "Test content";
        FileProcessor.writeToFile(testFile, content);

        String readContent = FileProcessor.readFromFile(testFile);
        assertEquals(content, readContent);
    }

    @Test
    void testReadFromFile_FileNotFound() {
        Exception exception = assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("non_existent_file.txt");
        });

        assertTrue(exception.getMessage().contains("non_existent_file.txt"));
    }
}