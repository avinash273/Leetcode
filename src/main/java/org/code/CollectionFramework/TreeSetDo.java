package org.code.CollectionFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDo {
    void implementTreeSet() {
        TreeSet<String> set = new TreeSet<>();
        //unordered addition of elements
        set.add("d");
        set.add("c");
        set.add("b");
        set.add("a");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


        System.out.println("SubSet: " + set.subSet("b", true, "d", true));

        //reverse set
        System.out.println("Reverse Set: " + set.descendingSet());

        //remember this will remove that element, poll means, fetch and remove
        System.out.println("Highest Value: " + set.pollFirst());
        System.out.println("Lowest Value: " + set.pollLast());
    }

    class Book implements Comparable<Book> {
        int id;
        String name;
        double quantity;

        //constructor
        Book(int id, String name, double quantity) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
        }

        //default constructor
        public Book() {
            this.id = 0;
            this.name = "None";
            this.quantity = 0.0;
        }

        //compareTo implements Comparable Interface
        public int compareTo(Book b) {
            if (id > b.id)
                return 1;
            else if (id < b.id)
                return 0;
            else
                return 0;
        }
    }

    //to us this Book class
    void implementBook(){
        Set<Book> set = new TreeSet<Book>();
        Book b3 = new Book(2,"aka",11);
        Book b2 = new Book(1,"avi",10);
        Book b4 = new Book(3,"anki",12);
        Book b1 = new Book();

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);

        for(Book b: set){
            System.out.println(b.id+" "+b.name+" "+b.quantity);
        }
    }
}
