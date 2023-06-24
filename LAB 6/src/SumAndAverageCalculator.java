import java.util.Scanner;

/**
 * @author Onkar Dhillon
 * @version V2 02/14/2023
 * @purpose To create a get an unlimited amount of grades from the user by using a loop and a sentinel to end the loop \
 * of getting grades. The grade will also be validated then computed for the sum and average
 */

public class SumAndAverageCalculator {

    /**
     * main: it creates variables sum, count, grade, average, and constant SENTINEL and then loops to check if the grade
     * is equal to sentinel if it's not it will read grade and update the count giving us the sum and total grades entered
     */
    public static void main(String[] args) {

        // constant for sentinel
        final int SENTINEL = -1;

        // declaring and initializing sum, count, and average
        double sum = 0;
        int count = 0;
        double average = 0.0;

        // initializing grade to return of readGrades() method
        double grade = readGrades();


        while(grade != SENTINEL) {  //  looping if grade isn't equal to the sentinel
            sum += grade;  // it sums appends the grade to sum
            count ++;  // increments count if a grade is entered

            System.out.println("The grade entered was valid " + grade);  // prints that grade is valid
            grade = readGrades();  // reads the grade
        }
        
        if(count == 0) {  // if count is 0 then no grades were ever inputted
            System.out.println("No grades inputted"); // prints that no grades were inputted
        }else {
            average = sum / count;  // else calculates average
        }

        System.out.println("The sum of the grades is " + sum);  // prints sum
        System.out.println("The average of the grades is " + average);  // prints average
    }


    /**
     * readGrade : is checks in the grade entered is valid and repeats it isn't valid once it becomes valid it will
     * return the grade inputted
     * @return double grade
     */
    public static double readGrades() {

        double grade = 0.0;  // declaring and initializing grade and valid
        boolean valid;

        Scanner scan = new Scanner(System.in);

        do {
            // Read the weight in pounds from the user.
            System.out.print("Enter a grade: ");
            grade = scan.nextDouble();

            // Check if pounds is valid.
            valid = isValid(grade);

            // If pounds is not valid, print an error message.
            if (!valid) {
                System.out.println("Invalid input: the grade cannot be negative.");
            }

        } while(!valid); // If pounds is not valid, let user enter another value.

        return grade;
    }

    /**
     * isValid: Gets parameter double grade then takes the value and compares it to the max and min grades excepted and to the
     * sentinel to see if any of the right values were inputted if true it will return true else false
     * @param grade inputted by user
     * @return ((grade >= MIN_GRADE && grade <= MAX_GRADE) || grade == SENTINEL)
     */
    public static boolean isValid(double grade) {

        final int MIN_GRADE = 0; // constant for MIN_GRADE
        final int MAX_GRADE = 100;  // constant for MAX_GRADE
        final int SENTINEL = -1;  // constant for sentinel

        return ((grade >= MIN_GRADE && grade <= MAX_GRADE) || grade == SENTINEL);  // return true if valid and false if not
    }
}
