
//program: Find the two highest scores

import java.util.Scanner;

public class Exercise_5_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students(at least 2): ");
        int number_of_students = input.nextInt();

        System.out.println("Enter names and scores: ");
        String student_1 = input.next();
        float highest_score = input.nextFloat();
        String student_2 = input.next();
        float s_highest_score = input.nextFloat();

        if(s_highest_score > highest_score){

            String temp_name = student_1;
            float temp_score = highest_score;

            highest_score = s_highest_score;
            student_1 = student_2;

            s_highest_score = temp_score;
            student_2 = temp_name;
        }

        for(int i = 2; i < number_of_students; i++){

            String student = input.next();
            float score = input.nextFloat();

            if(score > highest_score) {

                s_highest_score = highest_score;
                student_2 = student_1;

                highest_score = score;
                student_1 = student;
            }
            else if(score > s_highest_score) {

                s_highest_score = score;
                student_2 = student;

            }

        }
        System.out.println("1.student: " + student_1 + ", highest score: " + highest_score);
        System.out.println("2.student: " + student_2 + ", next high score: " + s_highest_score);

    }
}
