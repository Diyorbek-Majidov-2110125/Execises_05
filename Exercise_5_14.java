
//program: Compute the greatest common divisor

import java.util.Scanner;

public class Exercise_5_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 positive integers: ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int little_n = (int)(Math.min(n1, n2));
        int gcd = 1;
        for(int i = 2; i <= little_n/2; i++){
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;

        }
        System.out.println("The greatest common divisor: " + gcd);
    }
}
