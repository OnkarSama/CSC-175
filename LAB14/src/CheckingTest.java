import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckingTest {

    Checking _checkings;

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        Money amount = new Money(100, 0);

        _checkings = new Checking("John Doe", "1234567890", amount);
    }


    @Test
    public void testWithdraw() {

        Money amount = new Money(100, 0);

        _checkings = new Checking("John Doe", "1234567890", amount);

        _checkings.withdraw(new Money(200, 0));

        Money expectedAmount = new Money(-100, 0);

        assertTrue("Error in overloaded testWithdraw", _checkings.getBalance().equals(expectedAmount));
    }

    @Test
    public void testWithdraw2() {

        Money amount = new Money(100, 0);

        _checkings = new Checking("John Doe", "1234567890", amount);

        _checkings.withdraw(new Money(200, 1));

        Money expectedAmount = new Money(-100, 1);

        assertTrue("Error in overloaded testWithdraw", _checkings.getBalance().equals(expectedAmount));
    }
}
