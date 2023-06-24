import java.util.Scanner;

public class ChangeCounter {

    public static void main(String[] args) {


        final double QUARTER_CONVERSION_FACTOR = 4; // 4 quarters = 1 dollar
        final double DIMES_CONVERSION_FACTOR = 10; // 10 dimes = 1 dollar
        final double NICKELS_CONVERSION_FACTOR = 20;  // 0 nickels = 1 dollar
        final double PENNIES_CONVERSION_FACTOR = 100; // 100 pennies = 1 dollar

        int numOfQuarters = 0;
        int numOfDimes = 0;
        int numOfNickles = 0;
        int numOfPennies = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");  // asking for input from the user to import 
        numOfQuarters = scan.nextInt();

        System.out.print("Enter the number of dimes: ");  // asking for input from the user
        numOfDimes = scan.nextInt();

        System.out.print("Enter the number of nickels: ");  // asking for input from the user
        numOfNickles = scan.nextInt();

        System.out.print("Enter the number of pennies: ");  // asking for input from the user
        numOfPennies = scan.nextInt();

// Calculate the conversion of quarters, dimes, nickels and pennies to amount of Dollars

        double quartersToDollars = numOfQuarters / QUARTER_CONVERSION_FACTOR;  // conversion of quarters to amount of Dollars
        double dimesToDollars = numOfDimes / DIMES_CONVERSION_FACTOR;  // conversion of dimes to amount of Dollars
        double nicklesToDollars = numOfNickles / NICKELS_CONVERSION_FACTOR;  // conversion of nickles to amount of Dollars
        double penniesToDollars = numOfPennies / PENNIES_CONVERSION_FACTOR;  // conversion of nickles to amount of Dollars

        double amountOfDollars = quartersToDollars + dimesToDollars + nicklesToDollars + penniesToDollars;

// print out the conversion

        System.out.println();  // making output easier to read

        System.out.println("The number of quarters inputted was " + numOfQuarters + ".");  //  printing out the number of quarters inputted
        System.out.println("The number of dimes inputted was " + numOfDimes + ".");  //  printing out the number of dimes inputted
        System.out.println("The number of nickles inputted was " + numOfNickles + ".");  //  printing out the number of nickles inputted
        System.out.println("The number of pennies inputted was " + numOfPennies + ".");  //  printing out the number of quarters inputted

        System.out.println();  // made output easier to read

        System.out.println("The total amount of dollars inputted was equal to $" + amountOfDollars);  // printing out the converted amount of quarters, dimes, nickels and pennies in dollars

// end of main program.
    }
}
