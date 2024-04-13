package JavaArrayList;

import java.util.ArrayList;

public class ArrayListForLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Loop Through an ArrayList
        // Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tata");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}


