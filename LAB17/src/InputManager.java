
/**
 * Manage input to be read from either keyboard or file.
 *
 * @author (Onkar Dhillon)
 * @version (V2)
 */

import java.util.Scanner;

public class InputManager {
    // Method: readOneAccountFrom
    // Precondition: inputSource is a Scanner object, already set up
    // to read from a text file or standard input source (keyboard).
    // Postcondition: returns an Account with the data read for its attributes.
    // Assumption: Account data will be in the format of: name,id,balance
    public static Account readOneAccountFrom(Scanner inputSource) {
        // Read one line of account data into oneLine
        System.out.println("Reading: name,id,balance");
        String oneLine = inputSource.nextLine();

        // Parse line of account data, separated by commas.
        Scanner lineTokenizer = new Scanner(oneLine);
        lineTokenizer.useDelimiter(",");

        // Get account data (i.e. name, accountNum and balance) from oneLine
        String name = lineTokenizer.next();
        String accountNum = lineTokenizer.next();
        int dollars = lineTokenizer.nextInt();
        int cents = lineTokenizer.nextInt();
        Money balance = new Money(dollars,cents);
        String accountType = lineTokenizer.next();
        Money overdraftMax = null;

        if(accountType.equals("c")){
            dollars = lineTokenizer.nextInt();
            cents = lineTokenizer.nextInt();
            overdraftMax = new Money(dollars,cents);
            Checking oneAccount = new Checking(name, accountNum, balance, overdraftMax);
            System.out.println("Account read: " + oneAccount);
            return oneAccount;
        } else if(accountType.equals("r")){
            // Create and return an Account object with the data read for one   account.
            Account oneAccount = new Account(name, accountNum, balance);
            System.out.println("Account read: " + oneAccount);
            return oneAccount;
        } else {
            System.out.println("Invalid Account type.");
            return null;
        }

    } // end readOneAccountFrom

} // end InputManager
