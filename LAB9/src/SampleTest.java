import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Test the Dog class.

public class SampleTest {
    private Dog _dog;

    private final float TOLERANCE = 0.0001f;

    /**
     * Default constructor for test class ATest.
     */
    public SampleTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        _dog = new Dog("Fido", 5.0f);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        _dog = null;
    }

    /**
     * Test methods
     */

    // Test the creation of Dog objects.
    @Test
    public void testCreation()
    {
        assertTrue("Error in testCreation ", "Fido".equals(_dog.getName()));
        assertEquals("Error in testCreation ", 5.0f, _dog.getAge(), TOLERANCE);

        Dog anotherDog = new Dog ("Lassie", 4.5f);
        assertTrue("Error in testCreation ", "Lassie".equals(anotherDog.getName()));
        assertEquals("Error in testCreation", 4.5f, anotherDog.getAge(), TOLERANCE);
    }

    // Test computation of person years.
    @Test
    public void testComputation()
    {
        float age = _dog.computePersonYears();
        assertEquals("Error in testComputation", 35.0f, age, TOLERANCE);
    }

    // Test equality of two dogs that have the same attributes.
    @Test
    public void testEquality()
    {
        String dogName = new String ("Fido");
        float dogAge = 4.7f + 0.2f + 0.1f;
        System.out.println ("age = " + dogAge);
        Dog myDog = new Dog (dogName, dogAge);

        assertTrue("Error in testEquality", _dog.equals(myDog));
    }

    // Test inequality of dogs with different data.
    @Test
    public void testInequality()
    {
        Dog difftNameDifftAge = new Dog ("Spot", 7.0f);
        boolean result1 = _dog.equals(difftNameDifftAge);
        assertFalse("Error in testInequality", result1);

        Dog difftNameSameAge = new Dog ("Spot", 5.0f);
        boolean result3 = _dog.equals(difftNameSameAge);
        assertFalse("Error in testInequality", result3);

        Dog sameNameDifftAge = new Dog ("Fido", 3.0f);
        boolean result2 = _dog.equals(sameNameDifftAge);
        assertFalse("Error in testInequality", result2);
    }
}
