package inheritance;

public class Dog extends Animal {
    private String owner;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog: " + getName();
    }
}
