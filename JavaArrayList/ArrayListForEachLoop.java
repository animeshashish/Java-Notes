package JavaArrayList;

import java.util.ArrayList;

public class ArrayListForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Animesh");
        name.add("Ashish");
        name.add("Hemrom");
        name.add("Ankita");
        name.add("Munda");

        for (String i : name) {
            System.out.println(i);

        }
    }
}


