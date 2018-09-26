/**
 *method convertFahtoCel converts temperature from Fahrenheit to Celsius
 *
 *the main program:
 *  - read a given body temperature, measured in Fahrenheit degrees
 *  - check if the temperature is in the Fahrenheit scale, else ask to enter a new temperature
 *  - display the temperature in Celsius degree and a warning in case the temperature is bigger than 37
 */
package com.sci.fahtocel;

import java.util.Scanner;

private class FahrenheitToCelsius {

    private static double convertFahtoCel(double fahT){

        double celT = (fahT - 32) / 1.8;
        return Math.floor(celT * 100) / 100d;

    }

    private static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your body temperature measured in Fahrenheit degrees:");
        double myFahTemp = sc.nextDouble();

        while (myFahTemp < -459.67 || myFahTemp > 1000) {
            System.out.println("You have enter a value outside the Fahrenheit scale, try again!");
            myFahTemp = sc.nextDouble();
        }

        System.out.println("Your body temperature is: " + convertFahtoCel(myFahTemp) + " Celsius degrees");
        if (convertFahtoCel(myFahTemp) > 37) System.out.println("You are ill!");

        sc.close();
    }

}
