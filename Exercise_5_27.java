
//program: Display leap years(101 to 2100)

public class Exercise_5_27 {
    public static void main(String[] args) {

        int count = 0;
        System.out.println("   Leap years (101, 2100):");

        for(int i = 101; i <= 2100; i++){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                count++;
                System.out.print(i + " ");
            }
            if(count % 10 == 0)
                System.out.println();
        }
        System.out.printf("\nBetween 101 and 2100, there are %d leap years.", count);
    }
}
