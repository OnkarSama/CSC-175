/**
 * Die.java
 * Represents one die (singular of dice) with faces showing values between 1 and numberOfSides.
 * Modified version of Chapter 4 example (Dr. Chays, Oct. 21, 2016, Onkar Dhillon Mar. 1, 2023).
 */

import java.util.Random;

public class Die {
    // attributes = state variables = instance data
    private int numberOfSides, faceValue;

    // Constructor: initializes the attributes of a Die.
    public Die() {
        this.numberOfSides = 6;
        this.faceValue = 1;
    }

    // Overloaded constructor with one parameter for number of sides.
    public Die(int theNumberOfSides) {
        this.numberOfSides = theNumberOfSides;
        this.faceValue = 1;
    }

    // Overloaded constructor with two parameters for number of sides and face value.
    public Die(int theNumberOfSides, int theFaceValue) {
        this.numberOfSides = theNumberOfSides;
        this.faceValue = theFaceValue;
    }

    //  Rolls the die by setting attribute faceValue to a pseudorandom number between 1 and numberOfSides.
    public void roll() {
        Random generator = new Random();
        this.faceValue = generator.nextInt(this.numberOfSides) + 1;
        //this.faceValue = (int) (Math.random() * this.numberOfSides) + 1;
    }

    //  Compute the total value of two dice:
    //  this Die (the object that the method is called on)
    //  and thatDie (the Die object received as parameter),
    //  and returns the total value of these two dice.
    public int computeSum(Die thatDie) {
        int total;

        total = this.faceValue + thatDie.faceValue;

        return total;
    }

    //  Returns a string representation of this die.
    public String toString() {
        String result;

        result = "Number of sides: " + this.numberOfSides +
                " Face value: " + this.faceValue;

        return result;
    }

    //  Accessor (getter method) for faceValue.
    public int getFaceValue() {
        return this.faceValue;
    }

    //  Accessor (getter method) for numberOfSides.
    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    //  Mutator (setter method) for faceValue.
    public void setFaceValue(int theNewValue) {
        this.faceValue = theNewValue;
    }

    //  Mutator (setter method) for numberOfSides.
    public void setNumberOfSides(int theNewNumberOfSides) {
        this.numberOfSides = theNewNumberOfSides;
    }

    public boolean equals(Die die){

        return this.faceValue == die.getFaceValue();

    }

} // end of class Die
