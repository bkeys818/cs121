package abstractClasses;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Cat:");
        cat.giveOwnerLove();
        System.out.println("Dog:");
        dog.giveOwnerLove();
    }
}
