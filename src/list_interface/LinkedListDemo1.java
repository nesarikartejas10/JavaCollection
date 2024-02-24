package list_interface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<Object> ll = new LinkedList<Object>();

        //Add new element
        ll.add(100);
        ll.add("Welcome");
        ll.add(15.5);
        ll.add('A');
        ll.add(true);
        System.out.println(ll); //[100, Welcome, 15.5, A, true]

        //size of LinkedList
        System.out.println("Number of elements in LinkedList : " + ll.size()); //5

        //Remove element
        ll.remove(1);
        ll.remove(true);
        System.out.println(ll); //[100, 15.5, A]

        //Insert new element in middle
        ll.add(2, "Java");
        ll.add(4, false);
        System.out.println(ll); //[100, 15.5, Java, A, false]

        //Retrieve specific element
        System.out.println(ll.get(2)); //Java

        //Replace element
        ll.set(2, "C#");
        System.out.println(ll); //[100, 15.5, C#, A, false]

        //contains()
        System.out.println(ll.contains(false)); //true

        //isEmpty()
        System.out.println(ll.isEmpty()); //false

        //Read elements of LinkedList using for loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //Read elements of LinkedList using for-each loop
        for (Object element : ll) {
            System.out.println(element);
        }

        //Read elements of LinkedList using iterator
        Iterator<Object> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}