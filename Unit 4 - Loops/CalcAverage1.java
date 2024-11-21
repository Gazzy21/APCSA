import java.util.Scanner;

public class CalcAverage1 {
    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);
        int sum = 0, input = 0, count = 0;
        
        
        while (input != -1) {
            System.out.print("Enter input or -1 to end.");
            input = red.nextInt();
            if (input != -1 ) {
                sum = input + sum;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("The average is " + average);
        red.close();
    }
}