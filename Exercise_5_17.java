
//program: Display pyramid;

import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number between 1 and 15: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){

            for(int a = number - i; a >= 1; a--){
                System.out.print("  ");
            }

            for(int b = i; b >= 2; b--){
                System.out.print(b + " ");
            }

            for(int c = 1; c <= i; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
