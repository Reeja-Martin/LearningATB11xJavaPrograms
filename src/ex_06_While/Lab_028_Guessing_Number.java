package ex_06_While;

//Guess a number between 1to 10

import java.util.Random;
import java.util.Scanner;

public class Lab_028_Guessing_Number {
    public static void main(String[] args) {

        Random random = new Random();
        int number_to_guess=random.nextInt( 100)+1; //+1 means it include number 10 also

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts=0;

        while(true)
        {
            guess=scanner.nextInt();
            attempts++;

            if(guess < number_to_guess)
            {
                System.out.println("Too low, Try again");
            }
            else if(guess > number_to_guess)
            {
                System.out.println("Too high, Try again");
            }
            else
            {
                System.out.println("Congratzzz...it's Matching!!!!!");
                System.out.println("You guessed in "+attempts+ " attempts");
                break;
            }
        }

    }
}
