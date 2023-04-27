public class TestClass {
    public static void main(String[] args) {
        User user = new User();
        user = new User("Charmander");
        user = new User("Charmander", 60, 25);

        user.slowDown();
        user.slowDown(5);

        user.setHp(200);
        user.setAttack(40);
        System.out.println(user.getName());
        System.out.println(user.getHp());
        System.out.println(user.getAttack());
        System.out.println(user.getSpeed());
    }
}
