package interfaces;

public class AdvancedPlayer implements Player {
    int health = 500;

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.printf("Advanced player took %d damage. Health is now %d.%n", amount, health);
    }
}
