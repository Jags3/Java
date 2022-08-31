package palindrome;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {


    int num1, num2, num3;
    int temp=0;

    Scanner sc= new Scanner(System.in);

    System.out.println("enter 1st number");
    num1=sc. nextInt();

    System.out.println(" enter 2nd number");
    num2=sc.nextInt();


    System.out.println("enter 3st number");
    num3=sc. nextInt();

    temp=num1;
    num1=num3;
    num3=num2;
    num2=temp;

    System.out.printf(" Reverse of number is "+ num1+num2+num3);
}
}
