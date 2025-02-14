import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String sourceFile = "c:user/downloads/largefile.dat";
        String destBuffered = "c:user/downloads/largefile_buffered_copy.dat";
        String destUnbuffered = "c:user/downloads/largefile_unbuffered_copy.dat";

        long bufferedTime = copyFileBuffered(sourceFile, destBuffered);
        long unbufferedTime = copyFileUnbuffered(sourceFile, destUnbuffered);

        System.out.println("Buffered Copy Time: " + bufferedTime + " ns");
        System.out.println("Unbuffered Copy Time: " + unbufferedTime + " ns");
    }

    public static long copyFileBuffered(String source, String destination) {
        File inputFile = new File(source);
        File outputFile = new File(destination);

        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    public static long copyFileUnbuffered(String source, String destination) {
        File inputFile = new File(source);
        File outputFile = new File(destination);

        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
