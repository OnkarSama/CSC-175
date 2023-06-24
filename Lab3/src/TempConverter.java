/**
 * @author Onkar Dhillon
 * @version V2 2/2/2023
 * @purpose The purpose is to create a Temperature Convertor using methods
 */
import java.util.Scanner;

public class TempConverter {
    //-----------------------------------------------------------------
    //  Computes the Fahrenheit equivalent of a specific Celsius
    //  value using the formula F = (9/5)C + 32.
    //-----------------------------------------------------------------
    public static int readUserInput() {
        /*
        To read user input for temperature in celsius
         */

        int celsiusTemp = 0; // declaring and initializing variable

        Scanner scan = new Scanner(System.in); // setting up scanner

        System.out.print("Enter temperature in degrees Celsius that you want converted to Fahrenheit: "); // prompting user input

        celsiusTemp = scan.nextInt(); // getting user input

        return celsiusTemp; // returning user input
    }

    public static double temperatureConverter(int celsiusTemp){

        // Declaring constants
        final double CONVERSION_FACTOR = 9/5.0;
        final int BASE = 32;

        // Declare variables.
        double fahrenheitTemp;
        // Compute temperature in fahrenheit.
        fahrenheitTemp = CONVERSION_FACTOR * celsiusTemp + BASE;

        return fahrenheitTemp; // returning temperature fahrenheit
    }

} // end TempConverter