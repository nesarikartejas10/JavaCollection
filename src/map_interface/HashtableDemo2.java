package map_interface;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo2 {

    public static void main(String[] args) {

        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        ht.put(101,"John");
        ht.put(102,"David");
        ht.put(103,"Scott");
        ht.put(104,"Merry");
        ht.put(105,"Tye");

        System.out.println(ht); //{101=John, 102=David, 103=Scott, 104=Merry, 105=Tye}

        //entrySet method
        Set<Map.Entry<Integer, String>> entries = ht.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
