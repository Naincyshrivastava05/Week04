package junit;

import java.util.Collections;

public class StringUtils {
    public static String reverse(String s){
           StringBuilder sb = new StringBuilder(s);
           sb.reverse();
           return sb.toString();
    }
    public static  boolean isPalindrom(String s){
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        return s.equals(s2);
    }
    public static String toUpperCase(String s){

        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String s = "abcba";
        System.out.println("Reverse of the String-"+s+" is -"+reverse(s));
        System.out.println("String is Palindrom-"+isPalindrom(s));
        System.out.println("UpperCase String-"+ toUpperCase(s));

    }
}
