package JavaOperators;

import java.util.Scanner;

public class JavaRelationalOperator {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Enter two numbers");

        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println("True/False " + (a>b));
        System.out.println("True/False " + (a<b));
        System.out.println("True/False " + (a>=b));
        System.out.println("True/False " + (a<=b));
        System.out.println("True/False " + (a==b));
        System.out.println("True/False " + (a!=b));


    }
}
