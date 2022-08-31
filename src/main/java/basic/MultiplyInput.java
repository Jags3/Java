package basic;

import java.util.Scanner;

public class MultiplyInput {

    public static void dummy() {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int c = sc.nextInt();

        System.out.println("Enter a number ");
        int i = sc.nextInt();
        ;

        for (int b = 1; b <= i; b++) {
            num = c * i;
            System.out.println(c + "* " + i + "=" + num);
        }
    }

    public static void main(String[] args) {
        dummy();
    }
}
