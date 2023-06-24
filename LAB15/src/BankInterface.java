public interface BankInterface {

    /**
     * this adds a new account into the array of accounts there are and then increments the number of accounts
     *
     * @param account account is putting an account in the array of accounts using the numOfAccounts and the index
     */
    public void addAccount(Account account);


    /**
     * This search methods uses a count controlled loop to go through the array of Accounts
     * to find the account based on its id when the account was created
     *
     * @param id is the account number that is being searched for
     * @return accounts[i] || null
     */
    public Account search(String id);


    /**
     * Deposits the money amount into the account based on the id of the account
     *
     * @param id is the account number
     * @param amount amounts that wants to be added
     */
    public void deposit(String id, Money amount);


    /**
     * Withdraws the money amount into the account based on the id of the account
     *
     * @param id is the account number
     * @param amount amounts that wants to be subtracted
     */
    public void withdraw(String id, Money amount);


    /**
     * Takes all the Banks account and makes it to string
     *
     * @return str the bank to sting
     */
    public String toString();


    /**
     *
     * @return nameOfBank
     */
    public String getBankName();


    /**
     *
     * @return numOfAccounts
     */
    public int getNumOfAccounts();


    public void sortAccounts();
}
