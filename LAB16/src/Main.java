import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        IncomeStatisticsV2  incomeStatisticsV2 = new IncomeStatisticsV2();
        //IncomeStatistics incomeStatistics = new IncomeStatistics();

        boolean errorFree;

        //incomeStatisticsV2.readData();

        errorFree = incomeStatisticsV2.readData();

        if(!errorFree){
            System.out.println("Your data was not error free\n");
        }else {
            System.out.println("Your data was error free\n");
        }


    }
}
