/**
 * Extract first and last names from a full name, read from the user as "Last, First".
 *
 * @author (Onkar Dhillon)
 * @version (V1 02/07/2023)
 */

import java.util.Scanner;

public class ExtractNames {

    // Extract (and print to standard output) the first and last names in "First Last" (read from standard input).
    public static void main(String[] args) {
        // Set up a Scanner object for reading input from the user (keyboard).
        Scanner scan = new Scanner(System.in);

        // Read a full name from the user as "First Last".
        System.out.print("Enter your full name as \"FirstName LastName\": ");
        String fullName = scan.nextLine();

        // Find the index of the comma in the String entered by the user,
        // because the comma separates the last name from the first name.
        int positionOfComma = fullName.indexOf(" ");
        int len = fullName.length();

        // Extract the last and first names based on the index of the comma.
        String firstName = fullName.substring(0, positionOfComma);
        String lastName = fullName.substring(positionOfComma + 1, len);

        // Print the first name and last name.
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);

    } // end main

} // end ExtractNames
