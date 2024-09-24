package core_java.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterateDemo {

    public static void main(String[] args) {
        {
            Map<String,String> gfg = new HashMap<String,String>();

            // enter name/url pair
            gfg.put("GFG", "geeksforgeeks.org");
            gfg.put("Practice", "practice.geeksforgeeks.org");
            gfg.put("Code", "code.geeksforgeeks.org");
            gfg.put("Quiz", "www.geeksforgeeks.org");

            // using for-each loop for iteration over Map.entrySet()
            for (Map.Entry<String,String> entry : gfg.entrySet())
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());


            //iterating key and values alone
            // using keySet() for iteration over keys
            System.out.println("================Iterating key and values alone==================");
            for (String name : gfg.keySet())
                System.out.println("key: " + name);

            // using values() for iteration over values
            for (String url : gfg.values())
                System.out.println("value: " + url);

            // using iterators
            System.out.println("=========================Using iteator==================================");
            Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();

            while(itr.hasNext())
            {
                Map.Entry<String, String> entry = itr.next();
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
            }

            //iterating using forEach
            // forEach(action) method to iterate map
            System.out.println("======================================Using lambda forEach========================");
            gfg.forEach((k,v) -> System.out.println("Key = "
                    + k + ", Value = " + v));

            // looping over keys
            System.out.println("=======================Using keys to iterate====================================");
            for (String name : gfg.keySet())
            {
                // search  for value
                String url = gfg.get(name);
                System.out.println("Key = " + name + ", Value = " + url);
            }
        }
    }
}
