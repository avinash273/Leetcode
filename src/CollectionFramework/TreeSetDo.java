package CollectionFramework;

import java.util.*;

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
        System.out.println("Reverse Set: "+set.descendingSet());

        //remember this will remove that element, poll means, fetch and remove
        System.out.println("Highest Value: " + set.pollFirst());
        System.out.println("Lowest Value: " + set.pollLast());
    }
}
