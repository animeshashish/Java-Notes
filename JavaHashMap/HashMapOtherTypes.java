package JavaHashMap;

import java.util.HashMap;

public class HashMapOtherTypes {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Animesh", 27);
        people.put("Ankita", 29);
        people.put("Scholastica", 30);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " " + "Value: " + people.get(i));
        }

    }
}
