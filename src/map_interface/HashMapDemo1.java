package map_interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(101,"John");
        hm.put(102,"David");
        hm.put(103,"Scott");
        hm.put(104,"Merry");
        hm.put(105,"Tye");

        System.out.println(hm); //{101=John, 102=David, 103=Scott, 104=Merry, 105=Tye}

        System.out.println(hm.get(104)); //Merry

        hm.remove(104); // remove entry
        System.out.println(hm); //{101=John, 102=David, 103=Scott, 105=Tye}

        System.out.println(hm.containsKey(102)); //true
        System.out.println(hm.containsKey(104)); //false

        System.out.println(hm.containsValue("David")); //true
        System.out.println(hm.containsValue("Merry")); //false

        System.out.println(hm.isEmpty()); //false

        //Return all key
        Set<Integer> keys = hm.keySet();
        for(int key : keys){
            System.out.println(key);
        }

        //Return all values
        Collection<String> values = hm.values();
        for(String value : values){
            System.out.println(value);
        }

        //Read all keys and values
        for(int key:hm.keySet()){
            System.out.println(key+" : "+hm.get(key));
        }
    }
}
