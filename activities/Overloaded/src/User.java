public class User {
    private String name;
    private int hp, speed, attack;

    public User() {
        this.name = "Pikachu";
        this.hp = 100;
        this.speed = 80;
        this.attack = 30;
    }
    public User(String name) {
        this.name = name;
        this.hp = 100;
        this.speed = 80;
        this.attack = 30;
    }
    public User(String name, int speed, int attack) {
        this.name = name;
        this.hp = 100;
        this.speed = speed;
        this.attack = attack;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }

    public void slowDown() {
        this.speed -= 20;
    }
    public void slowDown(int by) {
        this.speed -= by;
    }
}
