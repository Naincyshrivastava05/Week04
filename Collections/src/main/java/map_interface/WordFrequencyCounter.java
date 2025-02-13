package map_interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String filePath){
        Map<String, Integer> countword = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine())!=null){
            line = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
                String[] words =    line.split("\\s+");
                for(String word:words){
                    countword.put(word,countword.getOrDefault(word,0)+1);
                }
            }
        }
        catch (IOException e){
            System.out.println("Error reading file"+e.getMessage());
        }
            return countword;

    }

    public static void main(String[] args) {
        String filePath = "input.txt";
        Map<String, Integer> map = countWordFrequency(filePath);
        System.out.println("Words with frequency"+ map);

    }
}
