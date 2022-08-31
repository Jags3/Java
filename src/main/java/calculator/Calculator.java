package calculator;

import java.util.Scanner;

public class Calculator {
    static int a = 1, b = 2;

    public static void add() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        System.out.println("Enter Data :");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        switch (c) {
            case 1:

                add();
                break;


            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a % b);
                break;
            default:
                System.out.println("invalid");
        }
    }
}

