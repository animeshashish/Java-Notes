package JavaHashMap;

import java.util.HashMap;

public class HashMapLoops {
    public static void main(String[] args) {
        HashMap<String, String> capitalStates = new HashMap<String, String>();

        // Loop Through a HashMap: Loop through the items of a HashMap with a for-each loop.
        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values.

        capitalStates.put("Bihar", "Patna");
        capitalStates.put("Jharkhand", "Ranchi");
        capitalStates.put("West Bengal", "Ranchi");
        capitalStates.put("Delhi", "New Delhi");

        // keySet() Method: To print only keys
        for (String i : capitalStates.keySet()) {
            System.out.println(i);
        }
        // values() Method: To print only values
        for (String i : capitalStates.values()) {
            System.out.println(i);
        }
        // Print keys and values
        for (String i : capitalStates.keySet()){
            System.out.println("Keys: " + i + " " + "Values: " + capitalStates.get(i));
        }
    }
}
