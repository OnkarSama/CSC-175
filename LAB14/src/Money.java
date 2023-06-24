/**
 * A blueprint for Money objects...
 *
 * @author (Onkar Dhillon)
 * @version (V1)
 */
public class Money {
    // attributes = state variables
    private long totalCents;

    /**
     * Constructor: initializes all attributes (i.e. totalCents)
     * based on the given dollars and cents.
     *
     * @param theDollars the number of dollars
     * @param theCents   the number of cents
     */
    public Money(int theDollars, int theCents) {
        this.totalCents = theDollars * 100L + theCents;
    }

    /**
     * Constructor: initializes all attributes (i.e. totalCents)
     * based on the given total cents.
     *
     * @param theCents the total number of cents
     */
    public Money(long theCents) {
        this.totalCents = theCents;
    }

    /**
     * getDollars:
     *
     * @return the number of dollars
     */
    public int getDollars() {
        return (int) (this.totalCents / 100);
    }

    /**
     * getCents:
     *
     * @return the number of cents (between 0 and 99, inclusive)
     */
    public int getCents() {
        return (int) (this.totalCents % 100);
    }

    /**
     * add: adds two money values
     * <p>
     * Precondition: two Money amounts are created and valid
     * Postcondition: the amount in this Money object is added to the Money amount given as parameter; the result is returned.
     * Neither the calling object nor the parameter are changed.
     *
     * @param theMoney the Money amount to add to the calling object (this)
     * @return Money, the sum
     */
    public Money add(Money theMoney) {

        return new Money(this.totalCents + theMoney.totalCents);
    }

    /**
     * subtract(): subtracts the two money values
     * Pre-condition: two Money amounts are created and valid
     * Post-condition: the amount in this Money object is subtracted to the Money amount given as parameter; the result is returned.
     * Neither the calling object nor the parameter are changed.
     *
     * @param theMoney the money amount to subtract to the objects money
     * @return Money, the difference
     */
    public Money subtract(Money theMoney) {

        return new Money(this.totalCents - theMoney.totalCents);
    }

    /**
     * toString: return String representation of this Money object
     * Precondition: this Money object is valid
     *
     * @return a String representation of this object
     */
    public String toString() {
        String result = "$" + this.getDollars() + ".";

        if (this.getCents() < 10) {
            result += "0";
        }

        result += this.getCents();
        return result;
    }

    /**
     * equals: compare the status of two money objects.
     *
     * @param other a Money object
     * @return true if calling object (this) is in the same state as the Money object received as a parameter, and false otherwise.
     */
    public boolean equals(Money other) {

        return (this.totalCents == other.totalCents);
    }

    /**
     * equals: compare the status of two money objects.
     *
     * @param theMoney a Money object
     * @return -1, 0, 1 depending on if the money is equal to the other money or less than or greater
     */
    public int compareTo(Money theMoney) {

        return Long.compare(this.totalCents, theMoney.totalCents);

    }
}
