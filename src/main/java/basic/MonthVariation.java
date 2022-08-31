package basic;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.time.Month;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Scanner;

public class MonthVariation {
    public static void main(String[] args) {
//        System.out.println("Enter your choice :");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        System.out.println("Enter the number");
//        int num = sc.nextInt();
//        input=num+input;
//
//
//        switch (input) {
//            case 1:
//                System.out.println("jan");
//                break;
//            case 2:
//                System.out.println("feb");
//                break;
//            case 3:
//                System.out.println("march");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//            case 6:
//                System.out.println("june");
//                break;
//            case 7:
//                System.out.println("july");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("september");
//                break;
//
//            default:
//                System.out.println("invalid");
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("Current Date = " + calendar.getTime());
//        // Add 3 months to the Calendar
//        calendar.add(Calendar.MONTH, 3);
//        System.out.println("Updated Date = " + calendar.getTime());

        String month = new Scanner(System.in).next().toUpperCase(Locale.ROOT);
        Month mon = Month.valueOf(month);
        System.out.println("Enter number of month(s) for addition ");
        int  Addition = new Scanner(System.in).nextInt();
        int addition = mon.getValue() + Addition;

        //System.out.println(basic.Month.of(addition).name());
        if (addition <= 12)
            System.out.println(Month.of(addition).name());
        else
            System.out.println(Month.of(addition - 12).name());
    }
}
