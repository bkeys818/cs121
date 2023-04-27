public class Student {
    private String name, major;
    private int age;

    Student(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age = age;
    }

    String showInfo() {
        return String.format("%s (%d) - %s", this.name, this.age, this.major);
    }
}
