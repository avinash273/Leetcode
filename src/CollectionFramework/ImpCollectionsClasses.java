package CollectionFramework;

import java.util.*;

/**
 * Collections.addAll()
 *
 */

public class ImpCollectionsClasses {
    void implementSomeClasses() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("First list: " + list);

        //Now trying to add more elements to using addAll()
        Collections.addAll(list,"D","E");

        //Now trying using String array
        String[] strArr = {"F","G"};
        Collections.addAll(list,strArr);

        System.out.println("Last list: " + list);
    }

}
