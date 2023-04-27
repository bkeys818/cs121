//******************************************************************
//  Activity 9
//  Name: Ben Keys
//  Data Structures Date: 01/23/2023
//******************************************************************
//  A game where the user is asked to predict the color that the
//  computer has chosen.
//******************************************************************

import java.util.Random;
import java.util.Scanner;

public class ColorGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("You will be ask to predict what color the computer has chosen.\n" +
                "The options are red (r), green (g), blue (b), orange (o), or yellow (y).\n" +
                "You will get 10 tries. Your score will be displayed at the end.\n");

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d. What color has the computer chosen?\n", i);
            String color = COLORS[random.nextInt(5)];
            char input = scanner.next().toLowerCase().charAt(0);
            if (input == color.charAt(0)) {
                System.out.printf("> Hooray! The computer also chose %s.\n", color);
                ++score;
            } else {
                System.out.printf("> Oh no! The computer chose %s.\n", color);
            }
        }

        System.out.printf("You got %d out of 10.", score);
    }

    final static private String[] COLORS = {"red", "green", "blue", "orange", "yellow"};
}
