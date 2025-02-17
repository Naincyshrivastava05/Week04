package junit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class ListManagerTest {
      static   List<Integer> list = new ArrayList<>();
    @Test
    public  void testAdditon(){
        ListManager.addElement(list,5);
        ListManager.addElement(list,4);
        ListManager.addElement(list,1);
        assertTrue(list.contains(5));
    }
    @Test
    public  void testDeletion(){
        ListManager.removeElement(list,1);
        assertTrue(!list.contains(1));
    }
    @AfterAll
    public static void getSize(){
        assertEquals(2,ListManager.getSize(list));
    }
}
