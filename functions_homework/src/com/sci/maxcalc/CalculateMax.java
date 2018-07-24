/**
 * method getMax() with two integers as parameters returns maximal of the two numbers.
 * main method reads three numbers from the console and prints the biggest of them using the getMax() method
 */
package com.sci.maxcalc;

import java.util.Scanner;

public class CalculateMax {

    public static int getMax(int numA, int numB ){

        int max;
        if (numA >= numB) max = numA;
        else max = numB;

        return max;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please type 3 integers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        System.out.println("The biggest of them is: " + getMax(num1, getMax(num2, num3)));

    }
}
