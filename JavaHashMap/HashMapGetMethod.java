package JavaHashMap;

import java.util.HashMap;

public class HashMapGetMethod {
    public static void main(String[] args) {
        HashMap<String, String> capitalState = new HashMap<String, String>();

        // HashMap Get() Method: To access a value in the HashMap, use the get() method and refer to its key.

        capitalState.put("Bihar", "Patna");
        capitalState.put("Jharkhand", "Ranchi");
        capitalState.put("Delhi", "New Delhi");
        capitalState.put("Mumbai", "Maharashtra");
        capitalState.put("Chennai", "Madras");

        // HashMap get() Method

        System.out.println(capitalState.get("Bihar"));
        System.out.println(capitalState.get("Jharkhand"));
        System.out.println(capitalState.get("Delhi"));
        System.out.println(capitalState.get("Mumbai"));
        System.out.println(capitalState.get("Chennai"));

        // Note: If we access key (index), we get the value as output. But if we access value we get null output.0
    }

}
