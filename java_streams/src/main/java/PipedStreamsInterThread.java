import java.io.*;

public class PipedStreamsInterThread {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writerThread = new Thread(() -> {
                try (DataOutputStream dos = new DataOutputStream(pos)) {
                    dos.writeUTF("Hello from Writer Thread!");
                } catch (IOException e) {
                    System.err.println("Writer Error: " + e.getMessage());
                }
            });

            Thread readerThread = new Thread(() -> {
                try (DataInputStream dis = new DataInputStream(pis)) {
                    System.out.println("Reader received: " + dis.readUTF());
                } catch (IOException e) {
                    System.err.println("Reader Error: " + e.getMessage());
                }
            });

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
