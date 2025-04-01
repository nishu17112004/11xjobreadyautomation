package ex_09_function;

import java.util.Random;
import java.util.Scanner;

public class L006_Random_Number {
    public static void main(String[] args) {
        Random random=new Random();
        int numberToGuess= random.nextInt(100)+1100;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int guess;
        int attempts=0;
        while(true){
            guess=scanner.nextInt();
            attempts++;
            if (guess<numberToGuess){
                System.out.println("too low,try again");
            } else if (guess>numberToGuess) {
                System.out.println("too high,try again");

            }else {
                System.out.println("correct!you guessed in56");
            }
        }
    }
}
