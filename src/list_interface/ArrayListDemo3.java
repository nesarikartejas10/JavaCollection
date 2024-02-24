package list_interface;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        String[] arr = {"Java","Python","Ruby","C#"};
        for(String element : arr){
            System.out.println(element);
        }

        //Convert Array into ArrayList
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(al); //[Java, Python, Ruby, C#]

        al.clear();
        System.out.println(al); //[]
        al.add("Dog");
        al.add("Cat");
        al.add("Elephant");
        System.out.println(al); //[Dog, Cat, Elephant]

        //Convert ArrayList into Array
        Object[] animal = al.toArray();
        for(Object ele : animal){
            System.out.println(ele);
        }

    }
}
