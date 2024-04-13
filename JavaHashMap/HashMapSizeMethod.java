package JavaHashMap;

import java.util.HashMap;

public class HashMapSizeMethod {
    public static void main(String[] args) {
        HashMap<String, String> capitalStates = new HashMap<String, String>();

        // HashMap Size() Method: To find out how many items there are, use the size() method

        capitalStates.put("Bihar", "Patna");
        capitalStates.put("Jharkhand", "Ranchi");
        capitalStates.put("West Bengal", "Ranchi");
        capitalStates.put("Delhi", "New Delhi");

// Print the number of items in Print() method using Size() method
        System.out.println(capitalStates.size());
    }
}
