package CollectionFramework;
import java.util.*;

public class PriorityQueueDo {
    void implementPriorityQueue(){
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("b");
        queue.add("a");
        queue.add("d");
        queue.add("c");

        System.out.println("Head: "+queue.peek());

        Iterator itr = queue.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
