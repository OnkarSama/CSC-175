import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class AccountTest {

    Account _account;

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        Money amount = new Money(100, 0);

        _account = new Account("John Doe", "1234567890", amount);
    }

    @Test
    public void testDeposit() {

        _account.deposit(new Money(50, 0));

        Money expectedAmount = new Money(150, 0);

        //System.out.println(_account.getBalance());

        assertTrue("Error in testDeposit", _account.getBalance().equals(expectedAmount));
    }

    @Test
    public void testWithdraw() {

        Money amount = new Money(100, 0);

        _account = new Account("John Doe", "1234567890", amount);

        _account.withdraw(new Money(50, 0));

        Money expectedAmount = new Money(50, 0);

        assertTrue("Error in testWithdraw", _account.getBalance().equals(expectedAmount));
    }

    @Test
    public void testTransfer() {
        Account source = new Account("John Doe", "1234567890", new Money(100, 0));
        Account destination = new Account("Jane Doe", "0987654321", new Money(0, 0));
        source.transfer(destination, new Money(50, 0));

        assertTrue("Error in testTransfer", source.getBalance().equals(destination.getBalance()));
    }

    @Test
    public void testEquals() {
        Account account1 = new Account("John Doe", "1234567890", new Money(100, 0));
        Account account2 = new Account("Jane Doe", "0987654321", new Money(50, 0));
        Account account3 = new Account("John Smith", "1234567890", new Money(0, 0));
        assertTrue("Error in testTransfer", account1.equals(account3));
    }
}