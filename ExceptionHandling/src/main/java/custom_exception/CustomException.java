package custom_exception;

import java.util.Scanner;



public class CustomException {
    public static void validAge(int age)throws InvalidAgeException{
        try{
            if(age<18){
                throw new InvalidAgeException("Age must be 18 or above");
            }
            System.out.println("Access granted");
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        validAge(age);

    }
}

