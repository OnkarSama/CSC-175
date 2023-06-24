import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Bank2Test {

    Bank2 _bank;
    Account _account0, _account1, _account2, _account3;

    @Before
    public void setUp(){
        _bank = new Bank2("Bank2");

        _account0 = new Account("Onkar Dhillon", "1234", new Money(100, 0));
        _account1 = new Account("Onkar Dhillon", "4573", new Money(100, 0));
        _account2 = new Account("Onkar Dhillon", "6767", new Money(100, 0));
        _account3 = new Account("Onkar Dhillon", "1204", new Money(100, 0));

    }

    @After
    public void tearDown(){
        _account0 = null;
        _account1 = null;
        _account2 = null;
        _account3 = null;
        _bank = null;
    }

    @Test
    public void testBank() {

        String actualBankName = _bank.getBankName();
        String expectedBankName = "Bank2";

        assertEquals("Error in testBank", actualBankName, expectedBankName);

        int actualNumOfAccounts = _bank.getNumOfAccounts();
        int expectedNumOfAccounts = 0;

        assertEquals("Error in testBank", actualNumOfAccounts, expectedNumOfAccounts);

    }

    @Test
    public void testAddAccount(){
        _bank.addAccount(_account0);
        Account actual = _bank.search("1234");
        assertEquals(_account0, actual);
    }

    @Test
    public void testSearch() {

        _bank.addAccount(_account0);
        Account foundAccount = _bank.search(_account0.getId());

        Account actualAccount = new Account("Onkar Dhillon", "1234", new Money(100, 0));


        assertTrue("Error in testSearch", foundAccount.equals(actualAccount));


    }

    @Test
    public void testDeposit(){

        _bank.addAccount(_account0);

        _bank.deposit("1234", new Money(50, 0));

        Money expectedAmount = new Money(150, 0);

        //assertEquals(_account1.getBalance(), expectedAmount1);

        assertTrue("Error in testDeposit", _account0.getBalance().equals(expectedAmount));
    }

    @Test
    public void testWithdraw(){

        _bank.addAccount(_account0);

        _bank.withdraw("1234",new Money(50, 0));


        Money expectedAmount = new Money(50, 0);

        assertTrue("Error in testWithdraw", _account0.getBalance().equals(expectedAmount));

    }

    @Test
    public void testToString() {

        _bank.addAccount(_account0);

        String actualString = _bank.toString();

        //System.out.println(actualString);

        String expectedString = "Bank Name: " + _bank.getBankName() + "\n" + _account0.toString() + "\n";

        //System.out.println(expectedString);

        assertEquals("Error in testToString", actualString, expectedString);

    }

    @Test
    public void testSort(){
    _bank.addAccount(_account0);
    _bank.addAccount(_account1);
    _bank.addAccount(_account2);
    _bank.addAccount(_account3);

    _bank.sortAccounts();
    String actualString = _bank.toString();


        String expectedString = """
                Bank Name: Bank2
                Onkar Dhillon (1204): $100.00
                Onkar Dhillon (1234): $100.00
                Onkar Dhillon (4573): $100.00
                Onkar Dhillon (6767): $100.00
                """;

        assertEquals("Error in testToString", actualString, expectedString);
    }

}
