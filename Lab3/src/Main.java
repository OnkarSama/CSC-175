/**
 * @author Onkar Dhillon
 * @version V2 2/2/2023
 * @purpose The purpose is to create a Temperature Convertor using methods from TempConverter.java
 */
public class Main {

    public static void main(String[] args) {

        /*

        int celsiusTemp = 0; // declaring and initializing variable
        double fahrenheitTemp = 0.0; // declaring and initializing variable

        celsiusTemp = TempConverter.readUserInput(); // getting what the user inputted

        fahrenheitTemp = TempConverter.temperatureConverter(celsiusTemp); // getting the converted temperature

        // Print equivalent temperatures in celsius and fahrenheit.
        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);

         */
        double poundsForce = 0.0;
        double newtons = 0.0;

        poundsForce = ForceConverter.readUserInput();  // getting what the user inputted

        newtons = ForceConverter.forceConverter(poundsForce); // getting the converted force

        System.out.println(poundsForce + " pounds force in newtons is " + newtons);  // printing conversion

    }
}
