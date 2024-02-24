package list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<Object>();

        //Add new element
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al); //[100, Welcome, 15.5, A, true]

        //size of arraylist
        System.out.println("Number of elements in ArrayList : "+al.size()); //5

        //Remove element
        al.remove(1);
        al.remove(true);
        System.out.println(al); //[100, 15.5, A]

        //Insert new element in middle
        al.add(2,"Java");
        al.add(4,false);
        System.out.println(al); //[100, 15.5, Java, A, false]

        //Retrieve specific element
        System.out.println(al.get(2)); //Java

        //Replace element
        al.set(2,"C#");
        System.out.println(al); //[100, 15.5, C#, A, false]

        //contains()
        System.out.println(al.contains(false)); //true

        //isEmpty()
        System.out.println(al.isEmpty()); //false

        //Read elements of ArrayList using for loop
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        //Read elements of ArrayList using for-each loop
        for(Object element:al){
            System.out.println(element);
        }

        //Read elements of ArrayList using iterator
        Iterator<Object> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
