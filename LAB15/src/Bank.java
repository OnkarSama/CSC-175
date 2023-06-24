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
    public void addAccount(Account account){
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
        for(int i = 0; i < numOfAccounts; i++) {
            if(accounts[i].getId().equals(id)){
                return accounts[i];
            }
        }
        return null;
    }

    /**
     * Deposits the money amount into the account based on the id of the account
     *
     * @param id is the account number
     * @param amount amounts that wants to be added
     */
    public void deposit(String id, Money amount) {
        Account account = search(id);
        if (account != null) {
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
        if (account != null) {
            account.withdraw(amount);
        }
    }


    /**
     * Takes all the Banks account and makes it to string
     *
     * @return str the bank to sting
     */
    public String toString() {
        String str = "Bank Name: " + nameOfBank + "\n";
        for (int i = 0; i < numOfAccounts; i++) {
            str += accounts[i].toString() + "\n";
        }
        return str;
    }

    /**
     *
     * @return nameOfBank
     */
    public String getBankName() {
        return this.nameOfBank;
    }

    /**
     *
     * @return numOfAccounts
     */
    public int getNumOfAccounts() {
        return this.numOfAccounts;
    }


    public void sortAccounts() {
        SortsClass.selectionSort(accounts, numOfAccounts);
    }

}
