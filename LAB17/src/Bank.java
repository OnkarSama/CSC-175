public class Bank implements BankInterface {
    private String nameOfBank;
    private Account[] accounts;
    private int numOfAccounts;


    /**
     * Constructor: initializes all attributes
     * sets the array of accounts to 100 accounts to make sure there are enough initialized
     * sets the number of accounts to 0
     *
     * @param nameOfBank the name of the bank
     */
    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
        this.accounts = new Account[100];
        this.numOfAccounts = 0;
    }

    /**
     * this adds a new account into the array of accounts there are and then increments the number of accounts
     *
     * @param account account is putting an account in the array of accounts using the numOfAccounts and the index
     */
    public void addAccount(Account account) {
        this.accounts[numOfAccounts] = account;
        numOfAccounts++;
    }

    /**
     * This search methods uses a count controlled loop to go through the array of Accounts
     * to find the account based on its id when the account was created
     *
     * @param id is the account number that is being searched for
     * @return accounts[i] || null
     */
    public Account search(String id) {

        sortAccounts();

        int accountIndex = binarySearch(accounts,0,numOfAccounts-1,id);

        if( accountIndex == -1){
            return null;
        } else {
            return accounts[accountIndex];
        }


    }


    /**
     * Deposits the money amount into the account based on the id of the account
     *
     * @param id     is the account number
     * @param amount amounts that wants to be added
     */
    public void deposit(String id, Money amount) {
        Account account = search(id);
        if(account != null) {
            account.deposit(amount);
        }
    }

    /**
     * Withdraws the money amount into the account based on the id of the account
     *
     * @param id is the account number
     * @param amount amounts that wants to be subtracted
     */
    public void withdraw(String id, Money amount) {
        Account account = search(id);

        if(account != null){
            if(account instanceof Checking checking) {
                checking.withdraw(amount);
            } else {
                if(account.getBalance().compareTo(amount) >= 0 ){
                    account.withdraw(amount);
                } else {
                    throw new InsufficientFundsException("Insufficient Funds");
                }

            }
        }
    }

    public Money getBalance(String id) {
        Money balance = null;
        Account account = search(id);
        if (account != null) {
            balance = account.getBalance();
        }
        return balance;
    }


    /**
     * Takes all the Banks account and makes it to string
     *
     * @return str the bank to sting
     */
    public String toString() {
        String str = "Bank Name: " + nameOfBank + "\n";
        for(int i = 0; i < numOfAccounts; i++) {
            str += accounts[i].toString() + "\n";
        }
        return str;
    }

    public void sortAccounts() {
        SortsClass.selectionSort(accounts, numOfAccounts);
    }

    /**
     * Searches the array items anArray[first] through anArray[last] for value by using a binary search.
     * Precondition: 0 <= first, last <= SIZE-1, where SIZE is the maximum size of the array, and
     * anArray[first] <= anArray[first+1] <= ... <= anArray[last].
     * Post-condition: If value is in the array, the method
     * returns the index of the array item that equals value;
     * otherwise the method returns -1.
     * @param anArray array of Accounts
     * @param first first index of the array which is zero
     * @param numOfAccounts number of accounts total
     * @param id the id that is being searched for
     * @return index of the found account
     */
    public static int binarySearch(Account[] anArray, int first, int numOfAccounts, String id) {



        int index;

        if(first > numOfAccounts) {

            index = -1;      // value not in original array

        } else {

            // Invariant: If value is in anArray,
            // anArray[first] <= value <= anArray[last]

            int mid = (first + numOfAccounts) / 2;

            if(id.equals(anArray[mid].getId())) {

                index = mid;  // value found at anArray[mid]

            } else if(id.compareTo(anArray[mid].getId()) < 0) {

                index = binarySearch(anArray, first, mid - 1, id);   // point X

            } else {

                index = binarySearch(anArray, mid + 1, numOfAccounts, id);    // point Y

            }  // end if
        }  // end if

        return index;
    }  // end binarySearch

    /**
     * @return nameOfBank
     */
    public String getBankName() {
        return this.nameOfBank;
    }

    /**
     * @return numOfAccounts
     */
    public int getNumOfAccounts() {
        return this.numOfAccounts;
    }



}
