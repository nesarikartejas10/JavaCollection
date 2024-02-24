package queue_interface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<String>();

        //Adding elements in queue--->add()  &  offer()
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.offer("C");
        pq.offer("D");

        System.out.println(pq); //[A, B, C, C, D]

        //get head element----> element()  &  peek()
        System.out.println(pq.element()); //A
        System.out.println(pq.peek()); //A

        //return and remove head element---> remove()  &  poll()
        pq.remove();
        System.out.println(pq); //[B, C, C, D]

        pq.poll();
        System.out.println(pq); //[C, C, D]

        //read data
        Iterator<String> it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
