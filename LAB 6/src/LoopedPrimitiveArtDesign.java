/**
 * @author Onkar Dhillon
 * @version V1 02/14/2023
 * @purpose To make two iterations of our custom design
 */

public class LoopedPrimitiveArtDesign {

    /**
     * main: this creates the constant for the number of iterations and then creates a for loop and calls drawComputer()
     * to print out the computer NUM_OF_ITERATION
     */
    public static void main(String[] args) {

        final int NUM_OF_ITERATIONS = 2;

        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {

            System.out.println();
            drawComputer("This is computer " + (i + 1));

        }

    }


    /**
     * monitorHead: Depicts the top of a monitor the bezel
     */
    public static void monitorHead() {

        System.out.println("   ___________________");
        System.out.println("   | _______________ |");
    }


    /**
     * monitorBody: Depicts the display of the monitor
     */
    public static void monitorBody() {

        System.out.println("   | |XXXXXXXXXXXXX| |");
        System.out.println("   | |XXXXXXXXXXXXX| |");

    }

    /**
     * monitorBottom: Depicts the bottom bezel of the monitor
     */
    public static void monitorBottom() {


        System.out.println("   | --------------- |");
        System.out.println("   |_________________|");
    }

    /**
     * monitorStand: Depicts the stand of the monitor
     */
    public static void monitorStand() {


        System.out.println("     __[_________]__  ");
        System.out.println(" ___[_______________]____");

    }

    /**
     * computerBody: Depicts the body of the computer
     */
    public static void computerBody() {

        System.out.println("|             [_____] []|");
        System.out.println("|             [_____] []|");

    }

    /**
     * computerBottom: Depicts the bottom of the computer
     */
    public static void computerBottom() {


        System.out.println("L_______________________J");

    }

    /**
     * keyboard: Depicts the keyboard
     */
    public static void keyboard() {


        System.out.println("   ___________________ ");
        System.out.println("  /###################\\ ");
        System.out.println(" /#####################\\ ");

    }

    /**
     * assembledMonitor: It puts together the whole of the monitor
     */
    public static void assembledMonitor() {

        monitorHead();
        monitorBody();
        monitorBody();
        monitorBottom();
        monitorStand();
    }

    /**
     * assembledComputer: Assembles the frame of the computer
     */
    public static void assembledComputer() {


        computerBody();
        computerBottom();

    }

    /**
     * drawComputer: this is assembling the whole computer calling assembledMonitor() assembledComputer() and keyboard()
     * @param label this is the number of which computer is being printed
     */
    public static void drawComputer(String label) {

        System.out.println(label);
        System.out.println();

        assembledMonitor();
        assembledComputer();
        keyboard();
    }

}
