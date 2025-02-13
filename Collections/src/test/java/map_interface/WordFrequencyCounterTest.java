package map_interface;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyCounterTest {
    @Test
    public void frequecyTest(){
        String filePath = "input.txt";

        Map<String , Integer> map = WordFrequencyCounter.countWordFrequency(filePath);
        Map<String,Integer> ans = new HashMap<>();
        ans.put("world",1);
        ans.put("java",1);
        ans.put("hello",2);


        assertEquals(ans,map);

    }

}
