import  java.lang.*;
import java.util.Scanner;

public class TryWithMultipleCatch {
    public static void multipleCatch(int[] arr, int index){
        try{
        if(arr == null || arr.length == 0) {
            throw new NullPointerException("Array is not initialized!");
        }
            System.out.println(arr[index]);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
                throw e;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr ={};
        multipleCatch(arr,1);

        int arr2[] = {10,20,30};
        multipleCatch(arr,4);

        int[] arr3 = {10,20,30};
        multipleCatch(arr,2);

    }
}
