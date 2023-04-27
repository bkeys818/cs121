package abstractClasses;

public class Cat extends Animal {
    private void scratch() {
        System.out.println("*** Scratches owner ***");
    }

    @Override
    void giveOwnerLove() {
        scratch();
    }
}
