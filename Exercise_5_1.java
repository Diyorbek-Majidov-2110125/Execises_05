
//program: Count positive and negative numbers and compute the average of numbers

import java.util.Scanner;

public class Exercise_5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number_of_negatives = 0;
        int count = 0;
        double sum = 0;
        System.out.println("Enter integers, the input ends if it is 0: ");

        int number ;
        while(true) {
            number = input.nextInt();
            if (number == 0) {
                if (count == 0)
                    System.out.println("No numbers are entered except 0");
                break;
            }
                if (number < 0)
                    number_of_negatives++;

                sum += number;
                count++;





    }   if(count > 0) {
            System.out.println("The number of negative numbers: " + number_of_negatives);
            System.out.println("The number of positive numbers: " + (count - number_of_negatives));
            System.out.println("The sum of numbers: " + sum);
            System.out.println("The average of numbers: " + sum / count);
        }
    }
}
