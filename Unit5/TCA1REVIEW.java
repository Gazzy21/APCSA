import java.util.Scanner;

public class TCA1REVIEW {
    public static void main(String[] args) {
        System.out.print("What town do you live in: ");
        Scanner red = new Scanner(System.in);
        String input;
        input = red.next();

        if (input.equals("Marlboro")) {
            System.out.println("Your zip code is: 07746");
        } else if (input.equals("Morganville")) {
            System.out.println("Your zip code is: 07751");
        } else {
            System.out.println("The zip code for this town is unknown.");
        }

        System.out.print("What is your age: ");
        int inputTwo;
        inputTwo = red.nextInt();

        if (inputTwo < 30) {
            int yearsTill = 30 - inputTwo;
            yearsTill += 2024;
            System.out.println("You will turn 30 in the year: " + yearsTill);
        } else if (inputTwo == 30) {
            System.out.println("You turned 30 this year!");
        } else {
            int yearsAgo = inputTwo - 30;
            yearsAgo = -yearsAgo + 2024;
            System.out.println("You turned 30 in the year: " + yearsAgo);
        }

        red.close();
    }
}