
//program: Compute PI

import java.util.Scanner;

public class Exercise_5_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter greater number(to find more exact PI): ");
        int number = input.nextInt();
        double pi = 0;

        for(int i = 1; i <= number; i++){
            pi += (4 * Math.pow(-1, i + 1)/(2 * i - 1));
        }
        System.out.println("PI: " + pi);
    }
}
