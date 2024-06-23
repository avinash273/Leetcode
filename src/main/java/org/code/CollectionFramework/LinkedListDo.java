package org.code.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDo {
    void implementLinkedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        //adding new elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);

        Iterator itr = list.iterator();

        //using while with hasNext() and next()
        while (itr.hasNext()) {
            System.out.println("List: " + itr.next());
        }

        //using for iterating
        for (Integer integerValue : list)
            System.out.println("For List: " + integerValue);

        //Reverse a List
        Iterator revItr = list.descendingIterator();

        //using reverse with hasNext() and next()
        while (revItr.hasNext()) {
            System.out.println("List: " + revItr.next());
        }

        //Remember this removes element at the first, or u can give positional argument
        list.remove();
        //this at last
        list.removeLast();
        System.out.println(list);

    }

}
