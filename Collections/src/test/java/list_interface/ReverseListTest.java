package list_interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ReverseListTest{
        @Test
    public void testArrayListReverse(){

            ArrayList<Integer> input = new ArrayList<>(List.of(6,4,2,9,1));
            ArrayList<Integer> output = new ArrayList<>(List.of(1,9,2,4,6));
            assertEquals(output,ReverseList.reverseArrayList(input));

            LinkedList<Integer> input2 = new LinkedList<>(List.of(1,2,3,4,5));
            LinkedList<Integer> output2 = new LinkedList<>(List.of(5,4,3,2,1));
            assertEquals(output2,ReverseList.reverseLinkedList(input2));

        }
    @Test
    public void testArrayListEmpty(){

        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        assertEquals(output,ReverseList.reverseArrayList(input));

        LinkedList<Integer> input2 = new LinkedList<>();
        LinkedList<Integer> output2 = new LinkedList<>();
        assertEquals(output2,ReverseList.reverseLinkedList(input2));

    }
    @Test
    public void testArrayListOneElement(){

        ArrayList<Integer> input = new ArrayList<>(List.of(6));
        ArrayList<Integer> output = new ArrayList<>(List.of(6));
        assertEquals(output,ReverseList.reverseArrayList(input));

        LinkedList<Integer> input2 = new LinkedList<>(List.of(5));
        LinkedList<Integer> output2 = new LinkedList<>(List.of(5));
        assertEquals(output2,ReverseList.reverseLinkedList(input2));

    }
}
