package set_interface;

import java.util.HashSet;

public class HashSetDemo2 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("X");
        hs.add("Y");
        hs.add("Z");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        System.out.println(hs); //[X, Y, Z, A, B, C]

        HashSet<String> hs1 = new HashSet<String>();
        hs1.addAll(hs);
        hs1.add("#");
        System.out.println(hs1); //[A, B, C, #, X, Y, Z]

        hs1.removeAll(hs);
        System.out.println("After removing : "+ hs1); //After removing : [#]
    }
}
