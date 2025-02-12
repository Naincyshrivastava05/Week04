package list_interface;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class RotateListTest {
    @Test
    public void rotationtest(){
        ArrayList<Integer> list = new ArrayList<>(List.of(40,30,50,60,70));
        ArrayList<Integer> output  = new ArrayList<>(List.of(70,60,40,30,50));

        assertEquals(RotateList.rotateList(list,2),output);
    }
}
