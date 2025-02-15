import java.io.*;

public class CheckedException {
    public static String readFile(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw e; // Allow it to propagate
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String path = "data.txt";
        try {
            System.out.println(readFile(path));
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}
