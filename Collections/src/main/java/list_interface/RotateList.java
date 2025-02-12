package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RotateList {
    public static List<Integer> rotateList(List<Integer> list, int rotation){
        if(list.isEmpty()) return list;
        List<Integer> ans = new ArrayList<>();
        int n = list.size();
        for(int i =n-rotation; i<n;i++){
            ans.add(list.get(i));
        }
        for(int i =0; i<n-rotation%n; i++){
            ans.add(list.get(i));
        }
      return  ans;
    }
    public static void main(String[] args){
        System.out.println("Enter rotation count");
        Scanner sc = new Scanner(System.in);
        int rotation = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>(List.of(40,50,60,70,80,90));
        System.out.println("List before rotation:- "+ list);
        System.out.println("List after rotation:- "+rotateList(list,rotation));
    }
}
