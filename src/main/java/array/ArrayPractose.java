package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayPractose {
    public static void main(String[] args) {
        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        for (int i = 0; i <= 2; i++) {
            array[i] = sc.nextInt();

        }

        for (int i = 0; i <= 2; i++) {
            System.out.println(array[i]);
        }
    }}