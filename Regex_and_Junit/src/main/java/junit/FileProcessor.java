package junit;

import java.io.*;
import java.util.*;

public class FileProcessor {

    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();

        System.out.print("Enter content to write: ");
        String content = scanner.nextLine();

        try {
            FileProcessor.writeToFile(filename, content);
            System.out.println("Content written to " + filename);

            String readContent = FileProcessor.readFromFile(filename);
            System.out.println("Read from file: " + readContent);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}