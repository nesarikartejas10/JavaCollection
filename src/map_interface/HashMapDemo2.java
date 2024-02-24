package map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(101,"John");
        hm.put(102,"David");
        hm.put(103,"Scott");
        hm.put(104,"Merry");
        hm.put(105,"Tye");

        System.out.println(hm); //{101=John, 102=David, 103=Scott, 104=Merry, 105=Tye}

        //entrySet method
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
