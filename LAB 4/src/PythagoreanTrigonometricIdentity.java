/**
 * To asked for measure of angles in degrees and getting the knowledge of pre-defined function of Math to solve
 *
 * @author (Onkar Dhillon)
 * @version (V1 02 / 08 / 2023)
 */


import java.util.Scanner;

public class PythagoreanTrigonometricIdentity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double angleInDegrees, angleInRadians, sineOfAngleSquared, cosOfAngleSquared, sumOfCosSquaredAndSinSquared = 0.0;

        String userContinue = null;
    /*
    The calling of other function to pass to the respective functions and to test the identity. And asking if the user wants to continue
    */

        userContinue = "yes";  // making our condition true, so it can run at least once

        while (userContinue.equals("yes")) { // while the user wants to continue it will read the angle in degrees again and again until ending

            angleInDegrees = readValues();  // reading the angle in  degrees

            angleInRadians = radianConverter(angleInDegrees); // converting the angle in degrees to radians

            /*
            This calculates the sin squared of the angle and the cos squared of the angle using the pow(), Math.sin() and Math.cos() functions.
            Then it calculates the sum of the cos squared and sin squared and returning sineOfAngleSquared, cosOfAngleSquared, sumOfCosSquaredAndSinSquared
            */

            sineOfAngleSquared = Math.pow((Math.sin(angleInRadians)), 2);
            cosOfAngleSquared = Math.pow((Math.cos(angleInRadians)), 2);

            sumOfCosSquaredAndSinSquared = sineOfAngleSquared + cosOfAngleSquared;

            System.out.println(); // make output clearer

            System.out.println("The angle inputted was " + angleInDegrees + " degrees.");  // echoing the input

            System.out.println("The sine of the angle " + angleInDegrees + " is " + sineOfAngleSquared + ".");  // the angle converted to sin^2

            System.out.println("The cosine of the angle " + angleInDegrees + " is " + cosOfAngleSquared + ".");  // the angle converted to cos^2

            System.out.println("The sine squared + cosine squared is: " + sumOfCosSquaredAndSinSquared); // the result of the sum

            System.out.println();


            // to see if  user wants  to continue  and making  it to  lower, so it  can be  typed anyway  as  long as  its yes  it will  loop

            System.out.println("Do you want to test another pythagorean trigonometric identity(enter yes to continue or anything else to end)? ");
            userContinue = scan.nextLine().toLowerCase();
        }

        System.out.println();  // make output clearer

        System.out.println("Thank you for testing!");  // ending statement

    }

    public static double readValues() {
        
    /*
    This is to read the values from the user the measure of the angle in degrees then to use the is_valid() to check if
    angleInDegrees falls under the conditions and return the angleInDegrees
    */

        Scanner scan = new Scanner(System.in);

        double angleInDegrees = 0.0;

        System.out.print("Enter the measured angle in degrees:  ");  // user input

        angleInDegrees = scan.nextDouble();

        while(!isValid(angleInDegrees)) {
            // while the angle is not valid it will loop

            System.out.println();  //make output clearer
            System.out.println("The input " + angleInDegrees + " is invalid.");  //printing error message
            System.out.println();  //make output clearer

            System.out.print("Enter the measured angle in degrees: ");
            angleInDegrees = scan.nextDouble();  // asking input
        }

        return angleInDegrees; //returning angle once valid

    }

    public static Boolean isValid(double angleInDegrees) {
    /*    
    To validate the angle and to return true or false if it is valid or not
    */

        if(angleInDegrees >= 0 && angleInDegrees <= 360) { // stating the conditions to check against
            return true;  // returning true if conditions are meet
        } else {
            return false;  // returning false if conditions are meet
        }
    }

    public static double radianConverter(double angleInDegrees) {
    /*
    This returns the angle given by the user in radians and returns that value
    */
        double angleInRadians = 0.0;

        angleInRadians = Math.toRadians(angleInDegrees);

        return angleInRadians;

    }

}

