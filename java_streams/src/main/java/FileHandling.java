import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        copyFile(sourceFile, destinationFile);
    }

    public static void copyFile(String source, String destination) {
        File inputFile = new File(source);
        File outputFile = new File(destination);

        if (!inputFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
