package JavaHashMap;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class HashMapRemoveMethod {
    public static void main(String[] args) {
        HashMap<String, String> CapitalStates = new HashMap<String, String>();

        // HashMap Remove() Method: To remove an item, use the remove() method and refer to the key

        CapitalStates.put("Bihar", "Patna");
        CapitalStates.put("Jharkhand", "Ranchi");
        CapitalStates.put("Delhi","New Delhi");
        CapitalStates.put("Mumbai", "Maharashtra");
        CapitalStates.put("Chennai", "Madras");
        CapitalStates.put("West Bengal", "Kolkata");

        // HashMap Remove() Method
        CapitalStates.remove("Mumbai");
        CapitalStates.remove("West Bengal");

        System.out.println(CapitalStates);


            }
        }



