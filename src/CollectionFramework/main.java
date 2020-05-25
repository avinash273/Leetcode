package CollectionFramework;

public class main {
    public static void main(String[] args){
        //Complete ArrayList implementation
        ArrayListDo ArrayListDo = new ArrayListDo();
        System.out.println("\nArrayList:");
        ArrayListDo.implementArrayList();

        //LinkedList implementation
        LinkedListDo LinkedListDo = new LinkedListDo();
        System.out.println("\nLinkedList:");
        LinkedListDo.implementLinkedList();

        //HashSet implementation
        HashSetDo HashSetDo = new HashSetDo();
        System.out.println("\nHashSet:");
        HashSetDo.implementHashSet();

        //TreeSet implementation
        TreeSetDo TreeSetDo = new TreeSetDo();
        System.out.println("\nTreeSet:");
        TreeSetDo.implementTreeSet();
        TreeSetDo.implementBook();

        //Priority Queue
        PriorityQueueDo PriorityQueueDo = new PriorityQueueDo();
        System.out.println("\nPriority Queue:");
        PriorityQueueDo.implementPriorityQueue();

        //HashMap implementation
        HashMapDo HashMapDo = new HashMapDo();
        System.out.println("\nHashMap:");
        HashMapDo.implementHashMap();

        //Some important collections class
        ImpCollectionsClasses ImpCollectionsClasses = new ImpCollectionsClasses();
        System.out.println("\nImp Collections Classes: ");
        ImpCollectionsClasses.implementSomeClasses();
    }
}
