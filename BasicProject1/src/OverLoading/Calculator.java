package OverLoading;

import java.util.Scanner;

public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    //  Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    //  Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        // Two integers
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + calc.add(a, b));

        //  Two doubles
        System.out.print("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum: " + calc.add(d1, d2));

        //  Three integers
        System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Sum: " + calc.add(x, y, z));
        
        sc.close();
    }
}
