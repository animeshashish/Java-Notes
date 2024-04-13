package JavaArrayList;

import java.util.ArrayList;

public class ArrayListIntegerType {
    public static void main(String[] args) {
        ArrayList<Integer> myNumber = new ArrayList<Integer>();

        myNumber.add(10);
        myNumber.add(20);
        myNumber.add(30);
        myNumber.add(40);
        myNumber.add(50);
        
        for (Integer i : myNumber) {
            System.out.println(i);
        }
    }
}
