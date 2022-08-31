package collections;

import java.util.HashMap;
import java.util.Map;

public class HMap {
    public static void main(String[] args) {

        // country(key),population(value)
        HashMap<String, Integer> a = new HashMap();

        //   Insertion
        a.put("India", 120);
        a.put("US", 100);
        a.put("Italy", 110);

        //  System.out.println(map);
//
//        map.put("US", 1000);
//        System.out.println(map);
//


        //loop
//        if (map.containsKey("US")) {
//            System.out.println("present" + map.get("US"));
//        } else {
//            System.out.println("not present");
//        }
//        System.out.println(map.get("Japan"));
//    }
//
//        int array[] = {1, 2, 3, 4};
//        for (int i = 0; i <= 3; i++)
//            System.out.println(array[i]);
//        System.out.println();



// for each
//        for (int val : array) {
//            System.out.println(val + "");
//        }


        for (String mapKey : a.keySet()) {
            System.out.println((mapKey + "" + a.get(mapKey)));
        }
    }
}

//        for (Map.Entry<String, Integer> e : a.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//
//        }}}

//        HashMap<String, Integer> items = new HashMap();
//        items.put("abc", 5);
//        items.put("efg", 2);
//        items.put("lkh", 7);
//
//        for (Map.Entry<String, Integer> item : items.entrySet()) {
//            System.out.format(item.getKey(), item.getValue());
//        }
//    }}