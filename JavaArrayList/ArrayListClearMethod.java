package JavaArrayList;

import java.util.ArrayList;

public class ArrayListClearMethod {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Clear() Method: To remove all the elements in the ArrayList, use the clear() method

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tata");

        cars.clear();
        System.out.println(cars);
    }
}
