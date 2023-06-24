import java.util.Scanner;

/**
 *
 * @author Onkar Dhillon
 * @version V1 1/31/2023
 * @purpose Lbs to Kgs
 */

public class PoundsToKilograms {

    /**
     *
     * @input from user: weight in pounds.
     * @output to the screen: weight in kilograms.
     * @assumptions : 1) 2.2 lbs = 1 kg
     *                2) The user will enter valid input, i.e. a non-negative number of pounds.
     *
     */


    public static void main(String[] args) {

        final double LBS_TO_KGS_CONVERSION_FACTOR = 2.2;


        double lbs, kgs;


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of pounds you'd like converted to kilograms: ");

        lbs = scan.nextDouble();

        kgs = lbs / LBS_TO_KGS_CONVERSION_FACTOR;

        System.out.println(lbs + " pounds is equal to " + kgs + " kilograms.");

    }
}
