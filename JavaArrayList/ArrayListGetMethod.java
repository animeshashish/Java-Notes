package JavaArrayList;

import java.util.ArrayList;

public class ArrayListGetMethod {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Get Method: To access the elements or item (elements position) in Arraylist
        // car.get();

        cars.add("Volvo"); // Create ArrayList of cars
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Use get() method to access the elements of ArrayList in println() method

        System.out.println("0th element of car is " + cars.get(0));
        System.out.println("1st element of car is " + cars.get(1));
        System.out.println("2nd element of car is " + cars.get(2));
        System.out.println("3rd element of car is " + cars.get(3));

    }
}
