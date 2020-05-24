package CollectionFramework;
import java.util.*;

public class ArrayListDo {
    void implementArrayList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("avi");
        list.add("anki");
        list.add("bob");

        //Traversing using while
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
