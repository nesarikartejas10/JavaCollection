package map_interface;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo1 {

    public static void main(String[] args) {

        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        ht.put(101,"John");
        ht.put(102,"David");
        ht.put(103,"Scott");
        ht.put(104,"Merry");
        ht.put(105,"Tye");

        System.out.println(ht); //{101=John, 102=David, 103=Scott, 104=Merry, 105=Tye}

        System.out.println(ht.get(104)); //Merry

        ht.remove(104); // remove entry
        System.out.println(ht); //{101=John, 102=David, 103=Scott, 105=Tye}

        System.out.println(ht.containsKey(102)); //true
        System.out.println(ht.containsKey(104)); //false

        System.out.println(ht.containsValue("David")); //true
        System.out.println(ht.containsValue("Merry")); //false

        System.out.println(ht.isEmpty()); //false

        //Return all key
        Set<Integer> keys = ht.keySet();
        for(int key : keys){
            System.out.println(key);
        }

        //Return all values
        Collection<String> values = ht.values();
        for(String value : values){
            System.out.println(value);
        }

        //Read all keys and values
        for(int key: ht.keySet()){
            System.out.println(key+" : "+ ht.get(key));
        }
    }
}
