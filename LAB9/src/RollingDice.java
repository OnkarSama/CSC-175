
/**
 * RollingDice demonstrates the creation and use of a user-defined class.
 *
 * Modified version of Chapter 4 example (Dr. Chays Oct. 24, 2012).
 */

public class RollingDice
{
    public static void main (String[] args)
    {
        // Declare 4 Die objects.
        Die die1, die2, die3, die4;
        boolean isEqual;

        // Define the Die objects by invoking a constructor of the Die class.
        die1 = new Die ();
        die2 = new Die (8);
        die3 = new Die (20, 5);
        die4 = new Die (10, 3);

        // Roll the dice.
        die1.roll ();
        die2.roll ();
        die3.roll ();
        die4.roll ();

        // Compute the total value of the first 2 dice, and the total value of the last 2 dice.
        //int total1 = die1.faceValue + die2.faceValue; // compile-time error
        int total1 = die1.computeSum (die2);
        int total2 = die3.computeSum (die4);

        // Print the value of each die, total value of the first 2 dice, and total value of the last 2 dice.
        System.out.println ("Die One: " + die1.toString());
        System.out.println ("Die Two: " + die2.toString());
        System.out.println ("Sum: " + total1);

        System.out.println ("Die Three: " + die3.toString());
        System.out.println ("Die Four: " + die4.toString());
        System.out.println ("Sum: " + total2);

        // Get and print the faceValue of die1.
        //System.out.println (die1.faceValue); // compile-time error
        System.out.println("The current face value of die1 is " + die1.getFaceValue());

        // Change the faceValue of a Die.
        //die2.faceValue = 3; // compile-time error
        //die1.setFaceValue (3);

        // Print the new faceValue.
        //System.out.println ("The new face value of die1 is " + die1.getFaceValue());

        isEqual = die1.equals(die2);

        if(isEqual){
            System.out.println("Die one and Die two are equal");
        } else {
            System.out.println("Die one and Die two are not equal");
        }
    }
}
