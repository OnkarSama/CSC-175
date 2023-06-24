/**
 * @author Onkar Dhillon
 * @version V1 02/09/2023
 * @purpose To get a number of grades from user then ask for them to input their grades into the program to then be summed
 * averaged based on how many of the first n grades they wanted to be computed. Then the average is converted to a letter
 * grade. Then the last step is getting how many grades are within k of the average.
 */

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // declaring and initializing variables
        int numOfGrades = 0;
        int n,k, gradesCloseToAverage = 0;
        double averageOfGrades = 0;
        char letterGrade;

        int[] grades = new int[numOfGrades];


        System.out.print("How many number of grades do you want to input: ");  // getting user input for num of grades
        numOfGrades = scan.nextInt();

        grades = readGrades(numOfGrades);  // reading grades

        System.out.print("How many of the grades would you like to be computed? ");  // asking how many of those you'd want computed
        n = scan.nextInt();

        System.out.print("What is the number within average do you want to check the grades for? ");  // asking within what range do you want to check
        k = scan.nextInt();

        averageOfGrades = computeAverage(grades, n);  // getting average

        letterGrade = convertToLetterGrade(averageOfGrades);  // getting letter grade

        gradesCloseToAverage = howManyCloseToAvg(grades, n, averageOfGrades, k);  // how many grades are close to average

        // outputting the average, letter grade, and the grades within k
        System.out.println("The average of the grades are " + averageOfGrades);

        System.out.println("The grade converted to a letter grade is " + letterGrade);

        System.out.println("The number of grades within the range of " + k + " is " + gradesCloseToAverage);

    }

    public static int[] readGrades(int numOfGrades) {
        /*
        Takes the parameter of int numOfGrades that takes how many grades are needed to be inputted.
        Then ask for user input numOfGrades times to add the values to int[] grades.
        parameters: int numOfGrades
        return: int[] grades
         */

        Scanner scan = new Scanner(System.in);  // setting up scanner for user input

        int[] grades = new int[numOfGrades];  // setting up array to the length of numOfGrades.

        for (int i = 0; i < numOfGrades; i++) {  // for loop for inputting grade

            System.out.println("Enter grades:");  // prompting user input
            grades[i] = scan.nextInt();  // getting user input from scanner and putting it to the corresponding index
        }

        return grades;  // returns grades
    }

    public static int computeSum(int[] grades, int n) {
        /*
        Takes the parameter of int[] grades which is the array of grades and n which is how many of the grades they want
        computed. Then calculates the sum and returns the sum.
        parameters: int[] grades, int n
        return: int sum
         */

        int sum = 0;  // declaring and initializing sum

        for (int i = 0; i < n; i++) {  // loop for the length of the array

            sum += grades[i];  // appends grades at index i to the sum
        }

        return sum;  // returns the sum
    }

    public static double computeAverage(int[] grades, int n) {
        /*
        Takes the parameter of int[] grades which is the array of grades and n which is how many of the grades they want
        computed. Then calls the method computeSum(grades, n) assigns it to sumOfGrades. The computes the sum based on
        the sum returned from computeSum and divides it by int n converted to a double
        parameters: int[] grades, int n
        return: double averageOfGrades
         */

        double averageOfGrades = 0.0;  // declaring and initializing averageOfGrades
        int sumOfGrades = 0;  // declaring and initializing sum

        sumOfGrades = computeSum(grades, n);  // assigning sumOfGrades to the method computeSum(grades, n)

        System.out.println("The sum of the grades is " + sumOfGrades);  // it prints the sum of the grades

        averageOfGrades = sumOfGrades / (double)n;  // calculating the average

        return averageOfGrades;  // returns the averageOfGrades

    }

    public static char convertToLetterGrade(double average) {
        /*
        Takes the parameter of double average then goes through if statements to assign the right letter grade to the
        variable char letterGrade depending on various ranges.
        A = [90,100]
        B = [80,90)
        C = [70,80)
        D = [60,70)
        F = [0,60)
        U = Anything out of the range
        parameters: double average
        return: char letterGrade
         */

        char letterGrade = 'U';  // Undefined case initializing and defining letterGrade

        if (average >= 90 && average <= 100) {  // checking if grade is an A
            letterGrade = 'A';
        } else if (average >= 80 && average < 90) {  // checking if grade is a B
            letterGrade = 'B';
        } else if (average >= 70 && average < 80) {  // checking if grade is a C
            letterGrade = 'C';
        } else if (average >= 60 && average < 70) {  // checking if grade is a D
            letterGrade = 'D';
        }else if (average >= 0 && average < 60) {  // checking if grade is a F
            letterGrade = 'F';
        }else { // default case is executed if all the above conditions are false:
            return letterGrade; // returns U
        }

        return letterGrade; // returns letterGrade updated
    }

    public static int howManyCloseToAvg(int[] grades, int n, double average, int k){
        /*
        Takes the parameter of int[] grades which is the array of grades, int n which is how many of the grades they want
        computed, double average which is the average of n grades, and then int k which is the range of within the average.
        This computes how many of the grades are withing k numbers of the average of the first n of the array grade and
        returns the count.
        parameters: int[] grades, int n, double average, int k
        return: int count
         */

        int count = 0;  // declaring and initializing count

        for (int i = 0; i < n; i++) {  // for loop for the first n grades

            if(grades[i] >= (average-k) && grades[i] <= (average+k)){  // checking if the grades are within k numbers
                count ++;  // increments count if it's true
            }
        }

        return count;  // returns the count
    }
}
