
//program: Display the ASCII character table

public class Exercise_5_15 {
    public static void main(String[] args) {

        int count = 0;
        System.out.println("                Characters table:");

        for(int i = '!'; i <= '~';i++){

            System.out.print((char)i + " ");
            count++;

            if(count % 10 == 0)
                System.out.println();
        }
    }
}
