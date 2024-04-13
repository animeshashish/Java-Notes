package JavaArrayList;

import java.util.ArrayList;

public class ArrayListSetMethod {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Set() Method: To modify/change an element, use the set() method and refer to the index number.
        // car.set(0, "Opel");

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.set(0, "Tata"); // Set the value of index 0 to Tata.
        cars.set(1, "Thar");
        cars.set(2, "Mahindra");
        cars.set(3, "Suzuki");

        System.out.println(cars);
    }
}
