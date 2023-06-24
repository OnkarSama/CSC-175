//********************************************************************
//  TempConverter.java    Author: Lewis/Loftus, Modified for lab exercise (DC)
//  Modified by Onkar DHillon
//
//  Demonstrates the use of primitive data types and arithmetic
//  expressions.  
//********************************************************************

import java.util.Scanner;

public class TempConverter {
    //-----------------------------------------------------------------
    //  Computes the Fahrenheit equivalent of a specific Celsius
    //  value using the formula F = (9/5)C + 32.
    //-----------------------------------------------------------------
    public static void main(String[] args) {

        // Declaring constants

        final double CONVERSION_FACTOR = 9/5.0;
        final int BASE = 32;

        // Declare variables.
        double fahrenheitTemp;
        int celsiusTemp = 0;  // value to convert

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius that you want converted to Fahrenheit: "); // prompting user input

        celsiusTemp = scan.nextInt(); // getting user input

        // Compute temperature in fahrenheit.
        fahrenheitTemp = CONVERSION_FACTOR * celsiusTemp + BASE;

        // Print equivalent temperatures in celsius and fahrenheit.
        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    } // end main

} // end TempConverter