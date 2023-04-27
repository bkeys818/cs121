public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ben", 21, 60);
        User user2 = new User("Ava", 22, 90);
        System.out.println(user1.getUserCount());
        System.out.println(user2.getUserCount());
        System.out.println(User.getUserCount());
    }
}
