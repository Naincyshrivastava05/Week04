package map_interface;

import java.util.*;

public class MaxValueKeyFinder{
    public static String findMaxKey(Map<String, Integer> map) {
            String ans="";
            int max = Integer.MIN_VALUE;
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max = entry.getValue();
                    ans = entry.getKey();
                }
            }
            return ans;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        String maxKey = findMaxKey(inputMap);
        System.out.println("Key with the highest value: " + maxKey);
    }
}

