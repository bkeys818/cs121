package inheritance;

public class Cat extends Animal {
    private boolean isEvil;

    public void setIsEvil(boolean evil) {
        isEvil = evil;
    }
    public boolean getIsEvil() {
        return isEvil;
    }

    @Override
    public String toString() {
        return "Dog: " + getName();
    }
}
