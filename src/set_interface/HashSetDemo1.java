package set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

    public static void main(String[] args) {

        HashSet<Object> hs = new HashSet<Object>();

        //Add new element
        hs.add(100);
        hs.add("Welcome");
        hs.add(15.5);
        hs.add('A');
        hs.add(true);
        System.out.println(hs); //[100, Welcome, 15.5, A, true]

        //size of HashSet
        System.out.println("Number of elements in HashSet : "+hs.size()); //5

        //Remove element
        hs.remove("Welcome");
        System.out.println(hs); //[100, 15.5, A, true]

        //contains()
        System.out.println(hs.contains(false)); //true

        //isEmpty()
        System.out.println(hs.isEmpty()); //false

        //Read elements of HashSet using for-each loop
        for(Object element:hs){
            System.out.println(element);
        }

        //Read elements of HashSet using iterator
        Iterator<Object> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
