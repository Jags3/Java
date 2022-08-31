package basic;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Month {

    public static void main(String[] args) {

        System.out.println("Enter your choice :");
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();


        switch (b) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;

            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("september");
                break;


            default:
                System.out.println("invalid");
        }
    }
}
