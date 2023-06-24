import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingTest {

    Checking _checking;

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        Money amount = new Money(100, 0);

        _checking = new Checking("John Doe", "1234567890", amount, new Money(100,0));
    }


    @Test
    public void testWithdraw() {

        _checking.withdraw(new Money(200, 0));

        Money expectedAmount = new Money(-100, 0);

        assertTrue("Error in overloaded testWithdraw", _checking.getBalance().equals(expectedAmount));
    }

    @Test
    public void testOverWithdraw() {
        // Create a checking account.

        try {
            // Withdraw an amount that should cause an exception; type InsufficientFundsException...
            _checking.withdraw( new Money(300, 0) );

            // If we reach this point in the code, that means the exception was not thrown as expected, so this test case fails.
            fail();
        }
        catch (InsufficientFundsException ife) {
            System.out.println("InsufficientFunds Exception on testOverWithdraw");
            ife.printStackTrace();
        }

    }

}
