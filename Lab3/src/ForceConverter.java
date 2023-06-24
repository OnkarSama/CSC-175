import java.util.Scanner;

/**
 * @author Onkar Dhillon
 * @version V2 2/2/2023
 * @purpose The purpose is to create a Force Convertor from pounds force to newtons using methods
 */
public class ForceConverter {
    /*
    4.44822162 Newtons per pound force
    */

    public static double readUserInput() {
        /*
        To read user input for pounds force
         */

        // declaring and defining variables
        double poundsForce = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of pound force you'd like converted to newtons: "); // prompting user input

        poundsForce = scan.nextDouble(); // getting user input

        return poundsForce; // returning user input
    }

    public static double forceConverter(double poundsForce) {

        // declaring and defining constants
        final double NEWTONS_PER_POUND_FORCE = 4.44822162;

        // declaring and defining variables
        double newtons = 0.0;

        newtons = poundsForce * NEWTONS_PER_POUND_FORCE;  // calculating conversion

        return newtons;
    }

}
