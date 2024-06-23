package org.code.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

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

        //Combine 2 Leetcode.HashMaps
        map.putAll(map1);

        System.out.println("map.keySet(): " + map.keySet());
        //pass key get value
        System.out.println("map.get(103): " + map.get(103));

        //iterating on HashMap
        System.out.println("\n");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(map);

        /**
         * Trying to implement it for class Book, note there are differences in iterating over values
         * so its, important, so check okay
         */
        class Book {
            int ID;
            String Name;
            int cost;

            Book(int ID, String Name, int cost) {
                this.ID = ID;
                this.Name = Name;
                this.cost = cost;
            }
        }
        HashMap<Integer, Book> BookMap = new HashMap<Integer, Book>();
        Book b1 = new Book(1, "A", 10);
        Book b2 = new Book(2, "B", 11);
        Book b3 = new Book(3, "C", 12);
        Book b4 = new Book(4, "D", 13);

        BookMap.put(101, b1);
        BookMap.put(102, b2);
        BookMap.put(103, b3);
        BookMap.put(104, b4);

        //Now trying the iterator for hash of a class type
        for (Map.Entry<Integer, Book> entry : BookMap.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();

            System.out.println("Key: " + key + " ID: " + b.ID);
        }

    }
}
