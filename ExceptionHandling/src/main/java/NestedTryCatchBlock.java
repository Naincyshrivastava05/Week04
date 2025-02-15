import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void nestedTry(int[] arr, int index, int devisor){
        try{
            if(index>arr.length|| index<0){
                throw new ArrayIndexOutOfBoundsException("Invalid array index!");
            }
            try{
                int result = arr[index]/devisor;
                System.out.println("Result:-"+result);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                throw e;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw  e;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        nestedTry(arr,5,2);

    }
}
