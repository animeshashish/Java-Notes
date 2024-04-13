package JavaHashMap;

import java.util.HashMap; // Import HashMap class from java.util package.

public class JavaHashMap { // Create HashMap class
    public static void main(String[] args) { // Create main method

        // HashMap: HashMap stores items in "key/value" pairs, and you can access them by an index of another type (ex. a String).

        // One object is used as a key (index) to another object (value). It can store different types:
        // String key and Integer values, or the same type, like String keys and String values.

        HashMap<String, String> capitalState = new HashMap<String, String>(); // Create an object of HashMap

// Put() Method: To Add keys and values (Country, City)
        capitalState.put("Bihar", "Patna");
        capitalState.put("Jharkhand", "Ranchi");
        capitalState.put("Delhi", "New Delhi");
        capitalState.put("Mumbai", "Maharashtra");
        capitalState.put("Chennai", "Madras");

        System.out.println(capitalState);
    }
}

