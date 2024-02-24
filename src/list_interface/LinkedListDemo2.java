package list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("X");
        ll.add("Y");
        ll.add("Z");
        ll.add("A");
        ll.add("B");
        ll.add("C");
        System.out.println(ll); //[X, Y, Z, A, B, C]

        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.addAll(ll);
        System.out.println(ll1); //[X, Y, Z, A, B, C]

        ll1.removeAll(ll);
        System.out.println("After removing : "+ll1); //After removing : []

        //Sort LinkedList
        System.out.println("Elements in LinkedList : "+ll); //[X, Y, Z, A, B, C]
        Collections.sort(ll);
        System.out.println("Elements in LinkedList after sorting : "+ll); //[A, B, C, X, Y, Z]
        ll.sort(Collections.reverseOrder());
        System.out.println("Elements in LinkedList after sorting in reverse order: "+ll); //[Z, Y, X, C, B, A]

        //Shuffle LinkedList
        Collections.shuffle(ll);
        System.out.println("Elements in LinkedList after shuffling : "+ll);
    }
}
