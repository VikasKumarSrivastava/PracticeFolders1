package MapInterface.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A",1); // O(log n)
        treeMap.put("C",3); // O(log n)
        treeMap.put("B",2); // O(log n)
        for(String key:treeMap.keySet()){
            System.out.println("Key "+key +" , Value "+treeMap.get(key));
    
        }

        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);// O(1)
        map.put("C", 3);
        map.put("B", 2);
    
        for(String key: map.keySet()){
            System.out.println("Key "+key+", Values "+map.get(key));
        }

    }


}
