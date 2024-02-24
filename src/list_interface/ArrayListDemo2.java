package list_interface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");
        System.out.println(al); //[X, Y, Z, A, B, C]

        ArrayList<String> al1 = new ArrayList<String>();
        al1.addAll(al);
        System.out.println(al1); //[X, Y, Z, A, B, C]

        al1.removeAll(al);
        System.out.println("After removing : "+al1); //After removing : []

        //Sort arraylist
        System.out.println("Elements in ArrayList : "+al); //[X, Y, Z, A, B, C]
        Collections.sort(al);
        System.out.println("Elements in ArrayList after sorting : "+al); //[A, B, C, X, Y, Z]
        al.sort(Collections.reverseOrder());
        System.out.println("Elements in ArrayList after sorting in reverse order: "+al); //[Z, Y, X, C, B, A]

        //Shuffle ArrayList
        Collections.shuffle(al);
        System.out.println("Elements in ArrayList after shuffling : "+al);
    }
}
