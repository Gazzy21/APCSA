import java.util.*;
// Fill in all the methods where it says WRITE YOUR CODE HERE …
public class ForLoops {

    public static void main(String[] args) {
        
    //System.out.println("Calling part1 method: ");
   // part1();
        
    //System.out.println("\nCalling part2 method: ");
    //part2();
        
    //System.out.println("\nCalling part3 method: ");
    //part3();

    //System.out.println("\nCalling part4 method: ");
    //part4();
        
    //System.out.println("\nCalling part5 method: ");
    //part5();

    System.out.println("\nCalling part6 method: ");
    part6();

    }

    public static void part1(){
        //print all the integers 1 through 200 on separate lines
        System.out.println("Here are the integers from 1 to 200");
        for(int x = 1; x <= 200; x++){
            System.out.println(x);
        }
        
    }
    public static void part2(){
        // print all the odd integers between 50 and 150 on separate lines.
        System.out.println("Here are the odd integers between 50 and 150");
        for(int x = 51; x < 150; x+=2){
            System.out.println(x);
        }       
    }
    public static void part3(){
        // print all the multiples of 4 between 4 and 200, inclusive.
        System.out.println("Here are all the multiples of 4 between 4 and 200");
        
        for(int x = 4; x <= 200; x+=4){
            System.out.println(x);
        }
    }
    public static void part4(){
        // print all the multiples of 20 from 1000 down to 20
        System.out.println("Here are all the multiples of 20 starting from 1000 and going down to 20");
        for(int x = 1000; x >= 20; x-=20){
            System.out.println(x);
        }
    }
    public static void part5(){
        // calculate and print the sum of all the numbers between 1 and 500.
        System.out.println("The sum of all the numbers between 1 and 500 is: ");
        int s = 0;
        for(int x = 1; x <= 500; x++){
           s += x;
        }
        System.out.println(s);
        
    }
    public static void part6(){
        // This method asks the user for a starting integer value and ending integer value, 
        // and then calculates and prints the sum and average of all the integers between 
        // the starting and ending value (inclusive).
    
        // WRITE YOUR CODE HERE ...
        Scanner red = new Scanner(System.in);
        System.out.print("What is your starting value?: ");
        int x = red.nextInt();
        System.out.print("What is your ending value?: ");
        int y = red.nextInt();
        int sum = 0;
        int count = 0;
        for(int g = x; g <= y; g++){
            sum = sum + g;
            count++;
        }
        red.close();
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + ((double)sum/count));
    }
}