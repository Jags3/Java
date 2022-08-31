package swapping;

import java.util.Scanner;

public class SwappingWithoutTemp {
    public static void main(String[] args) {
        int num1, num2;


        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        num1 = sc.nextInt();

        System.out.println(" enter 2nd number");
        num2 = sc.nextInt();

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.printf(" Reverse of number is " + num1 + num2);
    }
}


