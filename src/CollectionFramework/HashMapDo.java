package CollectionFramework;

import java.util.*;

public class HashMapDo {
    void implementHashMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "avinash");
        map.put(101, "ankita");
        map.put(102, "akash");

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(103, "bob");
        map1.put(105, "chan");
        map1.put(104, "alice");

        //Combine 2 HashMaps
        map.putAll(map1);

        System.out.println("map.keySet(): "+map.keySet());
        //pass key get value
        System.out.println("map.get(103): "+map.get(103));

        //iterating on HashMap
        System.out.println("\n");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        System.out.println(map);


    }
}
