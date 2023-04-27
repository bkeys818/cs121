//  Activity _
//  Name: Ben Keys
//  Data Structures Date: 01/23/2023
//******************************************************************
//  A game that allows two users to pick their Pokemon, enter its
//  stats, and then battle each other.
//******************************************************************

import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("POKEMON BATTLE");

        int rounds = 0;
        while (rounds == 0) {
            System.out.print("Enter an odd number of rounds: ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input % 2 == 1) {
                    rounds = input;
                } else {
                    System.out.printf("\u001B[31m%d isn't odd!\u001B[0m\n", input);
                }
            }
        }

        Player[] players = { new Player(), new Player() };

        for (int i = 0; i < rounds; i++) {
            new GameRound(i + 1, players);
            System.out.println("Wins");
            System.out.println("----");
            for (int ii = 0; ii < players.length; ii++) {
                System.out.printf("Player %d: %d\n", ii + 1, players[ii].wins);
            }
        }

        int winnerI = 0;
        for (int i = 1; i < players.length; i++) {
            if (players[i].wins > players[winnerI].wins) {
                winnerI = i;
            }
        }
        System.out.printf("\nPlayer %d wins the game!\n", winnerI + 1);
    }
}
