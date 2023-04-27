//******************************************************************
//  Activity 7
//  Name: Ben Keys
//  Data Structures Date: 01/30/2023
//******************************************************************
//  A game where the player guesses a number between 1 and 100.
//******************************************************************

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you give up:");

        int answer = random.nextInt(101),
                guess = 101, // assigned value in case `answer` is 0.
                guessCount = 0;

        while (answer != guess) {
            if (scanner.hasNextInt()) {
                ++ guessCount;
                guess = scanner.nextInt();
                if (guess > answer) {
                    System.out.println("Too high. Guess again:");
                } else if (guess < answer) {
                    System.out.println("Too low. Guess again:");
                } else {
                    System.out.println("Correct!");
                    System.out.println("Number of guesses: " + guessCount);
                }
            } else if (scanner.hasNext("q")) {
                System.out.printf("Quitter! The number was %d.", answer);
                guess = answer; // breaks loop
            }
        }
    }
}
