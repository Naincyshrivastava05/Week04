package list_interface;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList{
    public static List<Integer> reverseLinkedList(List<Integer> list){
        LinkedList<Integer> reverse = new LinkedList<>();
        for(Integer item: list){
            reverse.addFirst(item);
        }
        return reverse;
    }
    public static List<Integer> reverseArrayList(List<Integer> list){
        int left = 0; int right = list.size()-1;
        while(left<right){
            int temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> arr = new ArrayList<>(List.of(2,3,4,5,9));
        System.out.println("Original ArrayList: " + arr);
        System.out.println("Reversed ArrayList: " + reverseArrayList(arr));

        System.out.println("Original LinkedList: " + list);
        System.out.println("Reversed LinkedList: " + reverseLinkedList(list));

    }
}
