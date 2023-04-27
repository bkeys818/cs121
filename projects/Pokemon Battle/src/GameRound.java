/**
 * Runs a game round
 */
public class GameRound {
    /**
     * @param roundN  the number of rounds
     * @param players the two players
     */
    public GameRound(int roundN, Player[] players) {
        System.out.println("\nRound " + roundN);
        System.out.println("--------");

        int turn = 0;

        for (int i = 0; i < players.length; i++) {
            System.out.printf("Player %d: Select a Pokemon and enter its stats.\n", i + 1);
            players[i].pokemon = Pokemon.create();
            System.out.println();
            if (i != turn) {
                if (players[i].pokemon.speed > players[turn].pokemon.speed) {
                    turn = i;
                } else if (players[i].pokemon.speed == players[turn].pokemon.speed) {
                    if ((int)(Math.random() * 2) > 1) {
                        turn = i;
                    }
                }
            }
        }

        while (isInGame(players)) {
            if (turn == players.length) { turn = 0; }
            int defenderI = turn + 1 == players.length ? 0 : turn + 1;
            players[defenderI].pokemon.hp -= players[turn].pokemon.movePower;
            ++ turn;
        }

        for (Player player : players) {
            if (player.pokemon.hp > 0) {
                ++ player.wins;
            }
        }
    }
    private boolean isInGame(Player[] players) {
        int activePlayers = 0;
        for (Player player : players) {
            if (player.pokemon.hp > 0) {
                ++ activePlayers;
            }
        }
        return activePlayers > 1;
    }
}
