
import java.util.Scanner;

public class InterestCalculator {

    private static final int LOAN_DURATION_IN_YEARS = 10;
    private static final double RATE = 0.05;
    private static double amount = 0.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for the initial deposit amount
        System.out.print("Enter the initial deposit amount: ");
        double principle = input.nextDouble();

        // loop through 10 years/times
        for(int i = 0; i < LOAN_DURATION_IN_YEARS; i++) {
            // calculate amount of principle (the new amount)
            // a = p(1 + r)n
            amount = principle * Math.pow(1 + RATE, i + 1);
            System.out.printf("Amount on deposit after year %4d is $%,15.2f%n",
                    i + 1, amount);
        } // for
            
        // print the final amount
        System.out.printf("Final amount after is $%.2f%n", amount);

        int age = 21;
        boolean isSingle = false;
        boolean isMarried = false;
        if(age >= 18 && isSingle || !isMarried) {
            // code
        }
        else if(age >= 18 || isSingle) {
            // dangerous
        }
        else {
            // code
        }

        input.close();
    } // main
} // class