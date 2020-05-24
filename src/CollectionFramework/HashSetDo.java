package CollectionFramework;

import java.util.*;

public class HashSetDo {
    void implementHashSet() {
        HashSet<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");

        Iterator itr = set.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        //mostly all of ArrayList works here

        ArrayListDo ArrayListDo = new ArrayListDo();
        System.out.println("\nArrayList from HashSet");
        ArrayListDo.implementArrayList();

        //**** here i am trying to add ArrayList into HashSet
        ArrayList<String> list = new ArrayList<String>();
        list = ArrayListDo.implementArrayList();
        HashSet<String> set2 = new HashSet(list);
        Iterator itr2 = set2.iterator();

        while(itr2.hasNext())
            System.out.println("List from ArrayList: "+itr2.next());
    }
}
