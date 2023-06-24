/**
 * ClockExercise reads from the user the current time and a number of minutes
 * to advance the clock, then prints the new time.
 *
 * @author (Onkar Dhillon)
 * @version (V1 02/08/2023)
 */

import java.util.Scanner;

public class Clock {
    /**
     * Input (from the user): the current time and a number of minutes to add to the time
     * Output (to the screen): the new time
     * <p>
     * Assumption #1: The user will enter a valid time.
     * Assumption #2: The format of the time is 24 hours; the range of possible times are 0:0 through 23:59.
     * Assumption #3: For now, if the minutes are less than ten, the leading zero will not
     * be printed; e.g. if the time is 10:05, it will be printed as 10:5.
     */
    public static void main(String[] args) {
        // Declare constants
        final int HOURS_PER_DAY = 24;
        final int MINS_PER_HOUR = 60;

        // Set up Scanner object
        Scanner scan = new Scanner(System.in);

        // Read the current time from the user, and a number of minutes to advance the clock.
        System.out.print("Enter a time (24 hour format) as \"H:M\" between \"0:0\" and \"23:59\" : ");
        String currentTime = scan.next();
        System.out.print("Enter a number of minutes to advance the clock: ");
        int minutesToAdd = scan.nextInt();

        int lenOfCurrentTime = currentTime.length();

        // Extract the current hour and minute from the String entered by the user.
        int positionOfColon = currentTime.indexOf(':');
        String currentHourAsString = currentTime.substring(0, positionOfColon);
        String currentMinuteAsString = currentTime.substring(positionOfColon + 1, lenOfCurrentTime);

        // Convert current hour and minute from String to integer
        int currentHour = Integer.parseInt(currentHourAsString);
        int currentMinute = Integer.parseInt(currentMinuteAsString);

        // Advance the clock by the number of minutes specified by the user.
        int newMinute = currentMinute + minutesToAdd;
        int hoursToAdd = newMinute / MINS_PER_HOUR;  // e.g. if newMinute is 120, then 120 / 60 = 2 which is stored in hoursToAdd
        int newHour = currentHour + hoursToAdd;

        // At this point,
        // 1) The value of newMinute may be more than 59 and/or the value of newHour may be more than 23.
        // 2) Any excess of minutes in newMinute (i.e. over 59) has been accounted for in the assignment of newHour above,
        // e.g. if newMinute is 120, then 2 hours were added to newHour above.
        // Update newMinute so that it is between 0 (inclusive) and 59 (inclusive) and
        // update newHour so that it is between 0 (inclusive) and 23 (inclusive).

      /* Exercise:
        Add code to update newMinute and newHour appropriately.

       */

        
        newMinute = newMinute % MINS_PER_HOUR; // leftover minutes from rollover

        newHour = newHour + (newMinute / MINS_PER_HOUR); // seeing if there are any rollover minutes that needed to be converted to hours

        newHour = newHour % HOURS_PER_DAY;  // making sure if the hours is 24 it will roll back to 0
        // Print the initial and new times.
        System.out.println("The initial time was " + currentTime);
        System.out.println("After " + minutesToAdd + " minutes, " +
                "the new time is " + newHour + ":" + newMinute);

    } // end main

} // end ClockExercise
