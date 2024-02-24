package list_interface;

import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Dog");
        ll.add("Dog");
        ll.add("Cat");
        ll.add("Horse");
        ll.add(null);
        System.out.println(ll); //[Dog, Dog, Cat, Horse, null]

        //Add first and last elements
        ll.addFirst("Tiger");
        ll.addLast("Lion");
        System.out.println("After adding first and last element : "+ll); //[Tiger, Dog, Dog, Cat, Horse, null, Lion]

        //Retrieving first and last element
        System.out.println(ll.getFirst()); //Tiger
        System.out.println(ll.getLast()); //Lion

        //Removing first and last elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removing fisrt and last element : "+ll); //[Dog, Dog, Cat, Horse, null]
    }
}
