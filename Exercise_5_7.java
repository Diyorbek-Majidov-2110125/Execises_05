
//program: Financial application: compute future tuition


public class Exercise_5_7 {
    public static void main(String[] args) {
        float tuition = 1000;
        float rate_of_increase = 0.05f;
        float totalCost_4years = 0;
        int year = 10;
        float sum = 0;
        for(int i = 0; i < 10; i++){
            tuition += tuition * rate_of_increase;
        }
        System.out.println("After ten years, tuition: " + tuition);
        for(int j = 0; j < 4; j++){
            tuition += tuition * rate_of_increase;
            sum += tuition;
        }
        System.out.println("After ten years, total cost of 4 years' of tuition: " + sum);
    }
}
