package queue_interface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        //Adding elements in queue--->add()  &  offer()
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.offer("C");
        ll.offer("D");
        ll.add(null);

        System.out.println(ll); //[A, B, C, C, D, null]

        //get head element----> element()  &  peek()
        System.out.println(ll.element()); //A
        System.out.println(ll.peek()); //A

        //return and remove head element---> remove()  &  poll()
        ll.remove();
        System.out.println(ll); //[B, C, C, D, null]

        ll.poll();
        System.out.println(ll); //[C, C, D, null]

        //read data
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
