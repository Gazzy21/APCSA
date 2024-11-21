import java.util.*;

// Fill in all the methods where it says WRITE YOUR CODE HERE …
public class WhileLoops {

    public static void main(String[] args) {

        System.out.println("Calling part1 method: ");
        part1();

        System.out.println("\nCalling part2 method: ");
        part2();

        System.out.println("\nCalling part3 method: ");
        part3();

        System.out.println("\nCalling part4 method: ");
        part4();

        System.out.println("\nCalling part5 method: ");
        part5();

        System.out.println("\nCalling part6 method: ");
        part6();

    }

    public static void part1() {
        // print all the integers 1 through 200 on separate lines
        System.out.println("Here are the integers from 1 to 200");
        int x = 1;
        while (x <= 200) {
            System.out.println(x);
            x++;
        }

    }

    public static void part2() {
        // print all the odd integers between 50 and 150 on separate lines.
        System.out.println("Here are the odd integers between 50 and 150");
        int x = 51;
        while (x < 150) {
            System.out.println(x);
            x += 2;
        }
    }

    public static void part3() {
        // print all the multiples of 4 between 4 and 200, inclusive.
        System.out.println("Here are all the multiples of 4 between 4 and 200");

        int x = 4;
        while (x <= 200) {
            System.out.println(x);
            x += 4;
        }
    }

    public static void part4() {
        // print all the multiples of 20 from 1000 down to 20
        System.out.println("Here are all the multiples of 20 starting from 1000 and going down to 20");
        int x = 1000;
        while (x >= 20) {
            System.out.println(x);
            x -= 20;
        }
    }

    public static void part5() {
        // calculate and print the sum of all the numbers between 1 and 500.
        System.out.println("The sum of all the numbers between 1 and 500 is: ");
        int sum = 0;
        int x = 1;
        while (x <= 500) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static void part6() {
        // This method asks the user for a starting integer value and ending integer
        // value,
        // and then calculates and prints the sum and average of all the integers
        // between
        // the starting and ending value (inclusive).

        // WRITE YOUR CODE HERE ...
        Scanner red = new Scanner(System.in);
        System.out.print("What is your starting value?: ");
        int x = red.nextInt();
        System.out.print("What is your ending value?: ");
        int y = red.nextInt();
        int sum = 0;
        int count = 0;
        int g = x;
        while (g <= y) {
            sum = sum + g;
            count++;
            g++;
        }
        red.close();
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + ((double) sum / count));
    }
}