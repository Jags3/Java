package collections;

import java.util.HashSet;
import java.util.Iterator;

import static jdk.nashorn.internal.objects.Global.println;

public class HSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(3);
//        set.add(2);
//        set.add(0);
//        set.add(3);
////
//        if(set.contains(0))
//        {
//            System.out.println("contains");
//        }
//
//        if(!set.contains(6))
//        {
//           System.out.println("not contains");
//     }
//
//        set.remove(1);
//        if (set.contains(1))
//        {
//            System.out.println("removed ");
//        }
//        else
//        {
//            System.out.println("not exists");
//        }
//
   System.out.print("size of set"+set.size());
//        System.out.println("print all elements"+set);
//
//











































































































































































        Iterator it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());
//        it .next();
//        it.hasNext();
    }
    }

