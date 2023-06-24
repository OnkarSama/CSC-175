// This version of IncomeStatistics includes the code for readData
// that appears in Chapter 2.

import java.util.Scanner;

public class IncomeStatisticsV2 {
    final static int LOW_END = 10;    // low end of incomes
    final static int HIGH_END = 100;  // high end of incomes
    final static int TABLE_SIZE = HIGH_END - LOW_END + 1;

    int[] incomeData;    // used to store the income data,
    // incomeData[G] stores the total number of
    // people that fall into the G-thousand-dollar group

    public IncomeStatisticsV2() {
        incomeData = new int[TABLE_SIZE];
    }  // end constructor

    // readData Chapter 2
    public boolean readData() {
        // ------------------------------------------------------
        // Reads and organizes income statistics.
        // Precondition: The calling program gives directions and
        // prompts the user. Each input line contains exactly two
        // integers in the form G N, where N is the number of people
        // with an income in the G-thousand-dollar group and
        // LOW_END <= G <= HIGH_END. An input line with values of zero for
        // both G and N terminates the input.
        // Post-condition: incomeData[G-LOW_END] = total number of people
        // with an income in the G-thousand-dollar group. The values
        // read are displayed. If either G or N is erroneous (G and
        // N are not both 0, and either G < LOW_END, G > HIGH_END,
        // or N < 0), the method ignores the data line, sets the
        // return value to false, and continues. In this case,
        // the calling program should take action.
        // The return value is true if the data is error free.
        // -------------------------------------------------------


        Scanner input = new Scanner(System.in); // setting up input
        boolean errorFree = true;  // initializing and declaring a variable if there are any errors

        while (true) {  // infinite loop

            System.out.println("Enter: G N \nwhere " + LOW_END + " <= G <= " + HIGH_END + " and N >= 0 \nrepresenting N number of people in the G-thousand-dollar group\nEnter: 0 0 to quit.");  // prompting user input

            int G = input.nextInt();  // getting user input and setting it to g thousands of dollars
            int N = input.nextInt();  // getting user input and setting it to N number of people


            System.out.println();  // making output clearer

            if (G == 0 && N == 0) {
                break; // terminate input
            }

            if (G < LOW_END || G > HIGH_END || N < 0) {
                // ignore erroneous data and set errorFree flag to false
                errorFree = false;
                continue;
            }

            System.out.println("Income group "+ G +" contains " + N + " people.\n");  // prints out the income group and the number of people in that group
            incomeData[index(G)] += N;  // concatenates the number of people in that income group
        }

        return errorFree;  // return if there were any errors or not

    }  // end readData

    private int index(int group) {
        // Returns the array index corresponding to group number.
        return group - LOW_END;
    }  // end index

// other methods for class IncomeStatistics would follow

} // end IncomeStatistics
