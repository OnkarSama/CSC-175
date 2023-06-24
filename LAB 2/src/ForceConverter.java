import java.util.Scanner;

public class ForceConverter {

    public static void main(String[] args) {

        // declaring and defining constants
        final double NEWTONS_PER_POUND_FORCE = 4.44822162;

        // declaring and defining variables
        double newtons = 0.0;
        double poundsForce = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of pound force you'd like converted to newtons: "); // prompting user input

        poundsForce = scan.nextDouble(); // getting user input

        newtons = poundsForce * NEWTONS_PER_POUND_FORCE;  // calculating conversion

        System.out.println(poundsForce + " pounds force in newtons is " + newtons);  // printing conversion



    }
}
