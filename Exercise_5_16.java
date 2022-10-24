
//program: Find the factors of an integer

import java.util.Scanner;

public class Exercise_5_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer(>1): ");
        int number = input.nextInt();
        System.out.println("Factors of " + number + ":");
        int factor = 2;

        if(number > 1){
            while(factor <= number){
                if(number % factor == 0) {
                    System.out.print(factor + " ");
                    number /= factor;
                }
                else
                    factor++;
            }
        } else
            System.out.println("invalid input. Try again...");


    }
}
