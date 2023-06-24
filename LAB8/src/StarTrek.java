/**
 * Driver class = main class
 *
 * @author Dr. Chays, revised by Onkar Dhillon
 * @version 2023 February 21 (to be revised)
 */
public class StarTrek {

    public static void main(String[] args) {
        // Create a spaceship.
        Spaceship enterprise = new Spaceship(40, 50, "Enterprise", "Kirk");
        // enterprise is an object of type Spaceship, i.e. enterprise is an instance of the Spaceship class.

        // Print enterprise's data.
        System.out.println(enterprise.toString()); // OR System.out.println (enterprise);

        // Change captain to Picard.
        enterprise.setCaptain("Picard");

        // Print new captain.
        System.out.println("The new captain is " + enterprise.getCaptain());
        System.out.println();

        Spaceship klingon = new Spaceship(100, 40, "Klingon", "Onkar");

        System.out.println("The captain of the Klingon ship is " + klingon.getCaptain());
    } // end main
} // end class
