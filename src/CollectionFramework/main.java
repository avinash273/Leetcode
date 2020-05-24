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
    }
}
