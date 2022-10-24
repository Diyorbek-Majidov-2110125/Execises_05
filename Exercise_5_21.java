
//program: Financial application: compare loans with various interest rates

import java.util.Scanner;

public class Exercise_5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: " );
        double loan = input.nextDouble();
        System.out.print("Number of years: "  );
        int years = input.nextInt();
        System.out.println("Interest rate:        Monthyly payment:       Total payment:");

        for(double i = 5; i <= 8; i += 0.125){

            double monthly_payment = loan  * i/(100 * 12)/(1 - 1/Math.pow(1 + i/1200, years * 12));
            double total_payment = monthly_payment * 12 * years;

            System.out.printf("%8.2f              %8.2f                  %8.2f",i,monthly_payment,total_payment);
            System.out.println();
        }

    }
}
