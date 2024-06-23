package org.code.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections.addAll()
 * Collections.max()
 * Collections.min()
 * Collections.reverse() -->does in memory reverse
 * Collections.sort()
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

        //Min or Max in a list
        List<Integer> intList = new ArrayList<Integer>();
        Collections.addAll(intList,1,2,3,5,6,1,3,8,3,0,9);
        Collections.reverse(intList);
        Collections.sort(intList);
        System.out.println("Max of list "+intList+" is "+Collections.max(intList));


    }

}
