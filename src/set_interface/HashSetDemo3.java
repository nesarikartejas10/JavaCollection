package set_interface;

import java.util.HashSet;

public class HashSetDemo3 {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("set1 : "+set1); //set1 : [1, 2, 3, 4, 5]

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("set2 : "+set2); //set2 : [3, 4, 5]

//        //Union
//        set1.addAll(set2);
//        System.out.println("Union : "+set1); //Union : [1, 2, 3, 4, 5]

//        //Intersection
//        set1.retainAll(set2);
//        System.out.println("Intersection : "+set1); //Intersection : [3, 4, 5]

        //Subset
        set1.removeAll(set2);
        System.out.println("Subset : "+set1); //Subset : [1, 2]

        //containsAll()
        System.out.println(set1.containsAll(set2)); //true

    }
}
