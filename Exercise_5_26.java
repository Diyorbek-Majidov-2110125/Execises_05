
//program: Compute e ~ 2.71

import java.util.Scanner;

public class Exercise_5_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number(the greater, the more exact): ");
        int number = input.nextInt();
        double e = 0;
        for(int i = 1; i <= number; i++){
            double a = 1;
            for(int j = i - 1; j >= 1; j--){
                a = a * 1/j;
            }
            e = e + a;
        }
        System.out.printf("E: %8.16f", e);
        }
    }