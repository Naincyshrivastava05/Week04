import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteArrayStream{

    public static byte[] convertImageToByteArray(String imagePath) {
        try {
            return Files.readAllBytes(new File(imagePath).toPath());
        } catch (IOException e) {
            System.err.println("Error reading image: " + e.getMessage());
        }
        return new byte[0];
    }

    public static void writeByteArrayToImage(byte[] imageData, String outputPath) {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            fos.write(imageData);
            System.out.println("Image successfully written to: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error writing image: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputImage = "c:user/picutes/input.jpg";
        String outputImage = "c:user/picutes/output.jpg";

        byte[] imageData = convertImageToByteArray(inputImage);
        if (imageData.length > 0) {
            writeByteArrayToImage(imageData, outputImage);
        }

        // Verify if files are identical
        try {
            byte[] original = Files.readAllBytes(new File(inputImage).toPath());
            byte[] copied = Files.readAllBytes(new File(outputImage).toPath());
            System.out.println("Images match: " + Arrays.equals(original, copied));
        } catch (IOException e) {
            System.err.println("Error comparing images: " + e.getMessage());
        }
    }
}
