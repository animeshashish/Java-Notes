package JavaHashMap;

import java.util.HashMap;

public class HashMapClearMethod {
    public static void main(String[] args) {
        HashMap<String, String> capitalStates = new HashMap<String, String>();

        // HashMap clear() Method: To remove all items, use the clear() method

        capitalStates.put("Bihar", "Patna");
        capitalStates.put("West Bengal", "Kolkata");
        capitalStates.put("Jharkhand", "Ranchi");
        capitalStates.put("Delhi", "New Delhi");
        capitalStates.put("Chennai", "Madras");

        // HashMap clear() Method
        capitalStates.clear();
        System.out.println(capitalStates);
    }
}
