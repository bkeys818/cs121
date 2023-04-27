package abstractClasses;

public class Dog extends Animal {
    private void cuddle() {
        System.out.println("*** Snuggles next to owner ***");
    }

    @Override
    void giveOwnerLove() {
        cuddle();
    }
}
