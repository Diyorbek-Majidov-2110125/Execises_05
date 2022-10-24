
// program: Display four patterns using loops

import java.util.Scanner;

public class Exercise_5_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.println("Pattern A:");
        for(int i = 1; i <= number; i++){

            for(int a = 1; a <= i; a++){
                System.out.print(a + " ");
            }
            System.out.println();
            }

        System.out.println("Patter B:");
        for(int j = number; j >=1; j--){
            for(int b = 1; b <= j; b++)
                System.out.print(b + " ");
            System.out.println();
        }

        System.out.println("Pattern C");
        for (int k = 1; k <= number; k++){

            for(int c = number - k; c >= 1; c--)
                System.out.print("  ");

            for(int s = k; s >= 1; s--)
                System.out.print(s + " ");
            System.out.println();
        }

        System.out.println("Pattern D:");

        for(int d = 0; d < number; d++){

            for(int d1 = 0; d1 < d; d1++)
                System.out.print("  ");

            for(int d2 = 0; d2 < number - d; d2++)
                System.out.print((d2 + 1) + " ");

            System.out.println();
        }
    }
}

