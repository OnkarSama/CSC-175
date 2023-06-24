/**
 * @author Onkar Dhillon
 * @version V1 1/31/2023
 * @purpose the purpose of the program is to take three integers from the user and find the sum and average of the integers.
 */

import java.util.Scanner;

public class SumAndAverage {

    /**
     *
     * Input (from user): three integers.
     * Output (to the screen): sum of three integers and the average of the three.
     * Assumptions: The user enters an integer value.
     */

    public static void main(String[] args) {


        final double NUM_OF_INTS = 3.0;  // the constant of double since some average will be floating point numbers

        int num1 = 0;  // declaring and defining three integers
        int num2 = 0;
        int num3 = 0;

        int sum = 0;  // declaring and defining sum
        double average = 0.0;  // declaring and defining average

        Scanner scan = new Scanner(System.in);

        // user input

        System.out.println("Enter your first integer: ");
        num1 = scan.nextInt();

        System.out.println("Enter your second integer: ");
        num2 = scan.nextInt();

        System.out.println("Enter your third integer: ");
        num3 = scan.nextInt();

        sum = num1 + num2 + num3;  // calculating sum

        average = sum / NUM_OF_INTS;  // calculating average

        System.out.println();  // making output clearer

        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " equals " + sum + ".");  // echoing integers and printing out sum
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " equals " + average + ".");  // echoing integers and printing out average

    }
}
