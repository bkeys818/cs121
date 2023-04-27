public class Student {
    String name, major;
    int age;
    double gpa;

    Student(String name, String major, int age, double gpa) {
        this.name = name;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
    }

    void showInfo() {
        System.out.printf("%s (%d) - %s\n", this.name, this.age, this.major);
    }
}
