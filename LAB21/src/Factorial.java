/**
 * Trace iterative and recursive versions of the factorial function.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial {

    public static void main(String[] args) {

        try {
            //System.out.println(iterativeFactorial(-20));
            System.out.println(recursiveFactorial(20));
        } catch ( IllegalArgumentException iae){
            System.out.println("IllegalArgumentException on recursiveFactorial or iterativeFactorial");
            iae.printStackTrace();
        }

    }
    /**
     * iterativeFactorial(int n) - compute n factorial = n * (n - 1) * ... 1 for n > 0
     * The base case is fact(0) = 1
     * Precondition: n is a non-negative integer.
     * Post-condition: The factorial of n is returned.
     *
     * @param n n is a non-negative integer
     * @return result n factorial
     */
    public static int iterativeFactorial(int n) {
        //System.out.println("Entering iterativeFact, n = " + n);

        int result = 1;

        if(n < 0) {
            throw new IllegalArgumentException("Entered a integer less than 0");
        } else {
            for (int i = n; i > 1; --i) {

                result *= i;

            } // end for
        }

        //System.out.println("Leaving recursiveFact, returning " + result);

        return result;
    } // end iterativeFactorial

    /**
     * recursiveFactorial(int n) - compute n! = n * (n - 1)! for n > 0
     * The base case is fact(0) = 1
     * Precondition: n is a non-negative integer.
     * Post-condition: The factorial of n is returned.
     *
     * @param n is a non-negative integer
     * @return result  n factorial
     */
    public static int recursiveFactorial(int n) {
        //System.out.println("Entering recursiveFact, n = " + n);

        int result;

        if(n < 0) {
            throw new IllegalArgumentException("Entered a integer less than 0");
        } else if (n == 0) {  // Base case
            result = 1;
        } else {
            // Invariant: n > 0, so n - 1 >= 0.
            // Thus, fact(n - 1) returns (n - 1)!
            // n * (n - 1)! is n!

            result = n * recursiveFactorial(n - 1);
        } // end if..else

        //System.out.println("Leaving recursiveFact, returning " + result);

        return result;
    }   // end recursiveFactorial

} // end Factorial

