package JavaArrayList;

import java.util.ArrayList;

public class ArrayListSizeMethod {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Size() Method: To find out how many elements an ArrayList have, use the size method.

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Madza");
        cars.add("Tata");
        System.out.println(cars.size());
    }
}
