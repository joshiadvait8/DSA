package DSA_LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
     private class Node {
         private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
     private Node last;
     private int size;

    public void addLast(int item){
         Node node = new Node(item);
         //check if list is empty or not
        if(isEmpty()){
            first =last= node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }
    public void addFirst(int item){
        Node node = new Node(item);
        //check if list is empty or not
        if(isEmpty()){
            first=last=node;
        }else{
            node.next=first;
            first = node;
        }
        size++;
    }
    // to check repetitive empty or not
    private  boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        Node current  = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        //check if linked list has only one node
        if(first == last){
            first = last = null;
            return;
        }else {
            //[10 -> 20 -> 30]
            Node second = first.next;
            first.next = null; //by doing this Java's garbage collector will remove this from memory
            first = second;
        }
        size--;
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first==last){
            first=last=null;

        }else {
            //[10->20->30]
            //previous ->20
            //last -> 30 we have to make it to point 20
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
       size--;


    }
    private Node getPrevious(Node node){
        Node current = first;
        while(current!=null){
            if(current.next==node) return current;
            current=current.next;
        }
        return null;
    }

    public int size(){

        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index=0;
        while(current!=null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse(){
        if(isEmpty())
            return;

        // f        l
//        [10->20->30]  [10<-20<-30]
//          p  c   n
        Node previous = first;
        Node current = first.next;

        while(current!=null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next=null;
        first = previous;

    }

    public int getKthFromEnd(int k){
        //find kth node from end in one pass
        //[10->20->30->40->50]
        //          p1        p2
        //k=1 (50)
        //k=2 (40)
        //k=3 (30) (distance = 2)
        //generally dist betn p1 & p2 is k-1
        if(isEmpty())
            throw new IllegalStateException();

        Node a = first;
        Node b = first;
        for(int i=0;i<k-1;i++){
            b=b.next;
            if(b==null)
                throw new IllegalArgumentException();
        }
        while(b!=last){
            a=a.next;
            b=b.next;
        }
       return a.value;
    }

    public void printMiddle(){
        //[10->20->30]
        //for odd no. of nodes middle node is increased by 1
        //no.of nodes -> middle node position
//        1 -> 1
//        3 -> 2
//        5 -> 3
        //same is case for even no. of nodes just we have 2 middles
        //to check even odd we simply check if second pointer reached null(odd) or last(even)
        if(isEmpty())
            throw new IllegalStateException();
        Node a = first;
        Node b = first;
        while(b!=last && b.next!=last){
            b = b.next.next;
            a = a.next;
        }
        if(b==last)
            System.out.println(a.value);
        else
            System.out.println(a.value+" , "+a.next.value);


    }

    public boolean hasLoop(){
        Node slow = first;
        Node fast = first;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
    public static LinkedList createWithLoop(){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        //get reference of 30
        Node node = list.last;

        list.addLast(40);
        list.addLast(50);

        //create the loop
        list.last.next = node;
        return list;
    }

}
