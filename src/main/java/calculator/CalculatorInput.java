package calculator;

import java.util.Scanner;

public class CalculatorInput {
    public void Add(int a, int b) {
        System.out.println(a + b);
    }

    public void Subtract(int a, int b) {
        System.out.println(b - a);
    }

    public void Multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String args[]) {
        CalculatorInput x = new CalculatorInput();
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number");
        int a = sc.nextInt();

        int b = sc.nextInt();
        System.out.println(" enter your choice  1=+  2=-  3=*  4=/");
        int c = sc.nextInt();


        switch (c) {
            case 1:
                x.Add(a, b);
                break;
            case 2:
                x.Subtract(a, b);
                break;
            case 3:
                x.Multiply(a, b);
                break;

            case 4:
                x.divide(a, b);
                break;

            default:
                System.out.println("invalid");
        }
    }
}


