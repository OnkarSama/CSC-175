/**
 * Simulates two rolling die and then adding the two die values
 *
 * @author (Onkar Dhillon)
 * @version (V1 02 / 07 / 2023)
 */

import java.util.Random;

public class DiceRoller {

    //-----------------------------------------------------------------
    //  Generates random numbers in various ranges.
    //-----------------------------------------------------------------
    public static void main(String[] args) {

        Random generator = new Random();

        int dice1, dice2, sumOfDie = 0;  // setting up variables for dice 1 and dice2 and the sumOfDie


        dice1 = generator.nextInt(6) + 1;  // getting random roll for dice 1
        System.out.println("Your first roll was: " + dice1); // echoing roll for dice 1

        dice2 = generator.nextInt(6) + 1;
        System.out.println("Your second roll was: " + dice2);  // echoing roll for dice 2

        sumOfDie = dice1 + dice2;  // calculating sum of dice1 and dice2


        System.out.println("The sum of both the dice are: " + sumOfDie);  // printing out the sum of dice
    }
}