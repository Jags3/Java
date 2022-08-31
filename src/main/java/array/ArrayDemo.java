package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        //  add element
        List.add(10);
        List.add(70);
        List.add(30);
//        System.out.println(List);
//
        //pass index  (get value)
//        int element=List.get(1);
//        System.out.println(element);
//
        //to add element in the list
//        List.add(1,5);
//        System.out.println(List);
//

        //change element
//        List.set(1, 10);
//        System.out.println(List);

        //delete element
//        List.remove(2);
//        System.out.println(List);
//
        //size of list
//     int size=List.size();
//        System.out.println(size);

        //loops  System.out.println(List);
//        System.out.println(List);
//        System.out.println(List.size());

        for (int i = 0; i < List.size(); i++) {
            List.remove(i);
            System.out.println(List);

        }

//sorting
//Collections.sort(List);
//        System.out.println(List);
//    }
//}
    }
}