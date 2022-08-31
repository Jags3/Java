package palindrome;

import java.util.Scanner;

public class PalindromeString {

    private static void checkPalindromeInt(int num){
        System.out.println(new StringBuilder(Integer.toString(num)).reverse().equals(Integer.toString(num)));
    }

    public static void main(String[] args) {

        checkPalindromeInt(123);

//        String str,rev = "";
//
//        System.out.println("Enter a string:");
//        str = new Scanner(System.in).nextLine();

//        System.out.println(new StringBuilder(str).reverse().equals(str));
//        String revString = sb.toString();
//        System.out.println(sb.toString());

//        int length = str.length();
//
//        for (int i = length - 1; i >= 0; i--){
//            System.out.println(str.charAt(i));
//            rev = rev + str.charAt(i);
//        }
//
//
//        if (str.equals(rev))
//            System.out.println(str+" is a palindrome");
//        else
//            System.out.println(str+" is not a palindrome");

    }
}



