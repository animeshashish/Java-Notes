package JavaString;

import java.util.Locale;

public class JavaStringMethods {
    public static void main(String[] args) {

        // String methods: A String in Java is actually an object,
        // which contain methods that can perform certain operations on strings.

        // length() method:
        String name = "Animesh Ashish Hemrom";
        System.out.println("Length of the string is: " + name.length());

        // toUpperCase() method:
        String name2 = "Animesh Ashish Hemrom";
        System.out.println("Convert name to upper case: " +name2.toUpperCase() );

        // toLowerCase() method:
        String name3 = "Animesh Ashish Hemrom";
        System.out.println("Convert name to lower case: " + name3.toLowerCase());

        // indexOf() method: The indexOf() method returns the index (the position) of the first occurrence of a
        // specified text in a string (including whitespace):

        String name4 = "Animesh Ashish Hemrom";
        System.out.println(name4.indexOf("Animesh"));
    }
}
