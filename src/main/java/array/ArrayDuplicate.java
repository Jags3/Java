package array;

public class ArrayDuplicate {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 2,3};
        System.out.println("Duplicate element ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}

