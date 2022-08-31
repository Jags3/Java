package swapping;

public class Swapping {

    public static void dum() {
        int num1 = 1, num2 = 2;
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        dum();
    }
}
