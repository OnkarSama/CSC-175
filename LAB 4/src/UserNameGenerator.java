/**
 * Extract first and last names from a full name, read from the user as "First Last".
 * Then it finds the first initial and the first 5 letters of the last name
 * then finds a random number between 10 - 99 and then puts all the part together
 * creating a username.
 *
 * @author (Onkar Dhillon)
 * @version (V1 02/07/2023)
 */

import java.util.Random;
import java.util.Scanner;

public class UserNameGenerator {

    // Extract (and print to standard output) the first and last names in "First Last" (read from standard input).

    public static void main(String[] args) {


        int randomNumber = 0;
        String fullName, partiallyAssembledUserName, assembledUserName = null;

        fullName = userInput();

        partiallyAssembledUserName = nameSplitter(fullName);

        randomNumber = randomNumber();

        assembledUserName = partiallyAssembledUserName + randomNumber;

        System.out.println("Your username is: " + assembledUserName);

    } // end main

    public static String userInput(){

        // Set up a Scanner object for reading input from the user (keyboard).
        Scanner scan = new Scanner(System.in);

        String fullName = null;

        // Read a full name from the user as "First Last".
        System.out.print("Enter your full name as \"FirstName LastName\": ");

        fullName = scan.nextLine();

        return fullName;
    }

    public static String nameSplitter(String fullName) {

        int len, positionOfComma = 0;
        String firstName, lastName, last5, firstInitial, partiallyAssembledUserName = null;

        // Find the index of the comma in the String entered by the user,
        // because the comma separates the last name from the first name.
        positionOfComma = fullName.indexOf(" ");
        len = fullName.length();

        // Extract the last and first names based on the index of the comma.
        firstName = fullName.substring(0, positionOfComma);
        lastName = fullName.substring(positionOfComma + 1, len);

        firstInitial = firstName.substring(0,1);
        last5 = lastName.substring(0,5);

        partiallyAssembledUserName = firstInitial + last5;

        return partiallyAssembledUserName ;
    }
    public static int randomNumber() {

        Random generator = new Random();

        int randomNumber = 0;

        randomNumber = generator.nextInt(90) + 10;

        return randomNumber;
    }

} // end ExtractNames
