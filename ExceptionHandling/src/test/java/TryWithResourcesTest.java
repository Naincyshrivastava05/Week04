import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import  static  org.junit.jupiter.api.Assertions.*;

public class TryWithResourcesTest{
    @Test
    public void fileNotFound(){
        String filePath = "org.txt";
        assertThrows(FileNotFoundException.class,()->  TryWithResources.tryWithResources(filePath));
    }
    @Test
    public  void ioException(){
        String filePath = "example.jpg";
        assertThrows(IOException.class, ()->TryWithResources.tryWithResources(filePath));
    }
}
