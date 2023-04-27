package interfaces;

public class IntroPlayer implements Player {
    int health = 100;

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.printf("Intro player took %d damage. Health is now %d.%n", amount, health);
    }
}
