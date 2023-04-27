package interfaces;

public class Test {
    public static void main(String[] args) {
        IntroPlayer player1 = new IntroPlayer();
        AdvancedPlayer player2 = new AdvancedPlayer();

        player1.takeDamage(50);
        player2.takeDamage(100);
    }
}
