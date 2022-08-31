package evenOdd;

import java.util.Scanner;


public class EvenOddInput {

    public void number(int a) {
        if (a % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int a = sc.nextInt();

        EvenOddInput obj = new EvenOddInput();
        obj.number(a);
    }

}



