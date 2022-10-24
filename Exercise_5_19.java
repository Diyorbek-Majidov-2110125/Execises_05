
// program: Display numbers in a pyramid pattern

public class Exercise_5_19 {
    public static void main(String[] args) {
        for(int i = 0; i <= 7; i ++){

            for(int space = 7 - i; space >= 1; space--)
                System.out.print("    ");

            for(int degree = 0; degree <= i; degree++)
                System.out.printf("%4d", (int)Math.pow(2, degree));

            for(int r_side = i - 1; r_side >= 0 ; r_side--)
                System.out.printf("%4d", (int)Math.pow(2, r_side ));

            System.out.println();

        }
    }
}
