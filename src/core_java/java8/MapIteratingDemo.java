package core_java.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratingDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Abhishek");
        map.put(2,"Anurag");
        map.put(3,"Abhinav");
        map.put(4,"Vikas");

        //Using enhanced for loop
        System.out.println("Using enhanced for loop");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

        //using keyset for iterating over map
        System.out.println("===============Using keyset======================");
        for(Integer s : map.keySet()) {
            System.out.println("Key : " + s + " Value : " + map.get(s));
        }

        //using iterator
        System.out.println("=================using iterator========================");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

        //using lambda forEach
        System.out.println("===================using lambda forEach=====================");
        map.forEach((k,v) -> System.out.println("Key : " + k + " Value : " + v));
    }
}
