package array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int num[] = {8, 5, 8, 9, 4, 2};
        Arrays.sort(num);

        for (int a : num) {
            System.out.println(a);
        }
// minimum maximum via loop

//        int min , max;
//
//        for (int i = 0; i <= num.length-1; i++) {
//            if (i == 0) {
//                min = num[i];
//                System.out.println("minimum" + min);
//            } else if (i == num.length-1) {
//                max = num[i];
//                System.out.println("maxmium" + max);
//            }
//        }
//    }
    }
}

