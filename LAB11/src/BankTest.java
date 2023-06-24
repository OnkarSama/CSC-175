import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class BankTest {

    Bank _bank;
    Account _account1;

    @Before
    public void setUp(){
        _bank = new Bank("Bank1");
        _account1 = new Account("Onkar Dhillon", "1234", new Money(100, 0));

    }

    @After
    public void tearDown(){
        _account1 = null;
        _bank = null;
    }

    @Test
    public void testBank() {

        String actualBankName = _bank.getBankName();
        String expectedBankName = "Bank1";

        assertEquals("Error in testBank", actualBankName, expectedBankName);

        int actualNumOfAccounts = _bank.getNumOfAccounts();
        int expectedNumOfAccounts = 0;

        assertEquals("Error in testBank", actualNumOfAccounts, expectedNumOfAccounts);

    }

    @Test
    public void testAddAccount(){
        _bank.addAccount(_account1);
        Account actual = _bank.search("1234");
        assertEquals(_account1, actual);
    }

    @Test
    public void testSearch() {

        _bank.addAccount(_account1);
        Account foundAccount = _bank.search(_account1.getId());

        Account actualAccount = new Account("Onkar Dhillon", "1234", new Money(100, 0));


        assertTrue("Error in testSearch", foundAccount.equals(actualAccount));


    }

    @Test
    public void testDeposit(){

        _bank.addAccount(_account1);

        _bank.deposit("1234", new Money(50, 0));

        Money expectedAmount = new Money(150, 0);

        //assertEquals(_account1.getBalance(), expectedAmount1);

        assertTrue("Error in testDeposit", _account1.getBalance().equals(expectedAmount));
    }

    @Test
    public void testWithdraw(){

        _bank.addAccount(_account1);

        _bank.withdraw("1234",new Money(50, 0));


        Money expectedAmount = new Money(50, 0);

        assertTrue("Error in testWithdraw", _account1.getBalance().equals(expectedAmount));

    }

    @Test
    public void testToString() {

        _bank.addAccount(_account1);

        String actualString = _bank.toString();

       //System.out.println(actualString);

        String expectedString = "Bank Name: " + _bank.getBankName() + "\n" + _account1.toString() + "\n";

        //System.out.println(expectedString);

        assertEquals("Error in testToString", actualString, expectedString);

    }

}
