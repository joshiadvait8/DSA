package DSA_LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.size());
//        list.deleteLast();
//        list.deleteFirst();
        System.out.println(list.hasLoop());
        list.printMiddle();

        System.out.println(list.getKthFromEnd(0));

        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        list.reverse();
        int[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(list.size());
        System.out.println(list.indexOf(3));
        System.out.println(list.contains(3));

        LinkedList l = LinkedList.createWithLoop();
        System.out.println(l.hasLoop());

    }
}
