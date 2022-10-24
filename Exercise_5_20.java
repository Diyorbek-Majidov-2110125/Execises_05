
//program: Display prime numbers between 2 and 1,000

import java.util.Scanner;

public class Exercise_5_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("           Prime numbers:");

        for(int i = 2; i <= 1000; i++){

            boolean isPrime = true;

            for(int divisor = 2; divisor <= i/2; divisor++){
                if(i % divisor == 0){
                    isPrime = false;
                    break;
                }


            }
            if(isPrime) {
                count++;
                if (count % 8 == 0) {
                    System.out.println(i);
                } else
                    System.out.print(i + " ");
            }
        }

    }
}
