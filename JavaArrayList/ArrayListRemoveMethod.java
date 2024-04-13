package JavaArrayList;

import java.util.ArrayList;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {

        // Remove() Method: To remove an element, use the remove() method and refer to the index number.
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tata");

        cars.remove(0);
        cars.remove(3);
        System.out.println(cars);
           
    }
}
