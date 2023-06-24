import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

// Driver class for Bank project

public class ATM {


    public static void main(String[] args) {

        try {

            String inputFileName = "BankAccounts.txt"; // made using ChatGPT for the accounts
            String outputFileName = "UpdatedAccount.txt";
            // Read data from a file into a Bank.
            // Each line of the file has info for one account.
            BankInterface myBank = readFromFile(inputFileName);

            IOHandlerInterface ioh = new IOHandlerDialog();

            String userIDNumber;
            int transactionType;



            do {
                userIDNumber = readUserId(ioh);
                if (isIDValid(myBank, userIDNumber)) {
                    ioh.put("Account Found " + myBank.search(userIDNumber).toString());
                    break;
                } else if(userIDNumber.equals("quit")) {
                   System.exit(0);
                } else {
                    ioh.put("Account not Found. Retry Account Number");
                }
            } while (true);



            do {

                String userTransaction = readUserTransaction(ioh);

                transactionType = executeTransaction(myBank,userIDNumber,userTransaction,ioh);

            }while(transactionType != 3);

            writeToFile(outputFileName, myBank);



        } // end try
        catch (IOException ioe) {
            System.out.println("IOException in main: " + ioe.getMessage());
            ioe.printStackTrace();
        } // end catch
        catch (Exception e) {
            System.out.println("Exception in main: " + e.getMessage());
            e.printStackTrace();
        } // end catch
    } // end main


    /**
     * It uses and instance of BankInterface to create a bank then reads from BankAccounts.txt and adds those accounts
     * to the instance of bank
     * @param fileName is the file that it will read for account info
     * @return myBank it returns the bank after adding all the accounts
     */
    public static BankInterface readFromFile(String fileName) throws IOException {
        // Create a bank.
        BankInterface myBank = new Bank2("VOD"); // name of the bank

        // Open a file for reading.
        Scanner inputSource = new Scanner(new File(fileName));  // reading the file

        // while there are more tokens to read from the input source...
        while (inputSource.hasNext()){  // looping while the inputSource has another account

            // Read one line of input from the file into an Account object
            Account acct = InputManager.readOneAccountFrom(inputSource);

            // Store the account info in the bank.
        myBank.addAccount(acct);

        } // end while


        return myBank;

    } // end readFromFile

    /**
     *
     * @param ioh inout handler
     * @return the input the user typed in
     */
    public static String readUserId(IOHandlerInterface ioh) {
        return ioh.get("Enter your UserID number to login to your account: ");
    }

    /**
     *
     * @param bank bank that has the accounts
     * @param id  bank account number
     * @return true or false if the bank exist or not
     */
    public static boolean isIDValid(BankInterface bank, String id){
        return bank.search(id) != null;

    }

    /**
     * Creates variables for the parameters for the  getFromList() method
     * @param ioh the input handler
     * @return what the user selected from the dropdown
     */
    public static String readUserTransaction(IOHandlerInterface ioh){

        String listTitle = "Transactions";
        String prompt = "Select what transaction you would like to complete.";
        String[] choices = {"Check Balance", "Deposit", "Withdraw", "Exit"};
        return ioh.getFromList(listTitle, prompt,choices);
    }

    /**
     * The method is created to execute the transaction from four transaction:
     *          1) Check Balance
     *          2) Deposit
     *          3) Withdraw
     *          4) Exit
     * Then it goes through an inf statement that calls a method equal() to check which transaction is needed and calls
     * the necessary methods for that transaction
     *
     * @param myBank
     * @param userIDNumber the account ID number
     * @param userTransaction the transaction the user wants to complete: "Check Balance", "Deposit", "Withdraw", "Exit"
     * @param ioh the input handler
     * @return an integer that tells if it is exited or not
     */
    public static int executeTransaction(BankInterface myBank,String userIDNumber,String userTransaction, IOHandlerInterface ioh){
        String[] choices = {"Check Balance", "Deposit", "Withdraw", "Exit"};

        if(userTransaction.equals(choices[0])){
            ioh.put("Balance is: " + myBank.getBalance(userIDNumber));
            return 0;
        } else if(userTransaction.equals(choices[1])){
            Money depositAmount = readAmount(ioh, "Enter how much you want to deposit (format as xx.xx): ");
            myBank.deposit(userIDNumber, depositAmount);
            ioh.put("Successful Deposit \n" + "new balance is " +  myBank.getBalance(userIDNumber));
            return 1;
        } else if(userTransaction.equals(choices[2])) {
            Money withdrawAmount = readAmount(ioh,"Enter how much you want to withdraw (format as xx.xx): ");
            try {
                myBank.withdraw(userIDNumber, withdrawAmount);
                ioh.put("Successful Withdrawal \n" + "new balance is " +  myBank.getBalance(userIDNumber));
            } catch(InsufficientFundsException ife){
                ioh.put("Withdrawal failed. Insufficient funds in account");
                executeTransaction(myBank,userIDNumber,userTransaction,ioh);
            }
            return 2;
        } else {
            ioh.put("Thanks for Accessing the ATM");
            return 3;
        }

    }

    /**
     *
     * it is used to read the input from the user. The input is entered as xx.xx and is split using the delimiter '.'
     * the string from the amount is then parsed to an int data type which is then returned by creating a new money object
     * it is made to catch errors if it is not numeric and if it isn't formatted correctly.
     *
     * @param ioh in the Input handler object used
     * @param prompt the prompt is created to check whether the input is for a deposit or withdrawal
     * @return is the balance that will be deposited or withdrew
     */
    public static Money readAmount(IOHandlerInterface ioh, String prompt){

        int cents;
        int dollar;
        int delimiterPosition;

        String moneyAmount = ioh.get(prompt);

        try {

            delimiterPosition = moneyAmount.indexOf(".");

            dollar = Integer.parseInt(moneyAmount.substring(0,delimiterPosition));
            cents = Integer.parseInt(moneyAmount.substring(delimiterPosition+1));

            if(cents >= 100) {
                throw new NumberFormatException();
            }

        } catch(NumberFormatException | StringIndexOutOfBoundsException nfe) {
            ioh.put("Invalid money Amount. Please try again.");
            return readAmount(ioh,prompt);
        }

        return new Money(dollar,cents);
    }

    /**
     * writeToFile:
     *
     * @param fileName The name of the file to write to
     * @param bank A BankInterface object to write to the file
     * @throws IOException
     *
     * Writes the contents of the given bank to a file with the given file name. The accounts in the bank must be sorted beforehand.
     */
    public static void writeToFile(String fileName, BankInterface bank) throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter(fileName));

        output.printf(bank.toString());

        output.close();
    }

} // end ATM