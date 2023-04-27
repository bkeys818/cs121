public class User {
    String name;
    int age, score;
    private static int userCount = 0;

    public static int getUserCount() {
        return userCount;
    }

    public User(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        ++userCount;
    }
}
