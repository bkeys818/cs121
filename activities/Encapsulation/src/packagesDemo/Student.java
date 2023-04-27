package packagesDemo;

public class Student {
    public String name;
    private String major;
    public int age;
    private double gpa;

    public Student(String name, String major, int age, double gpa) {
        this.name = name;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
    }

    public void showName() {
        System.out.println(this.name);
    }

    protected void showMajor() {
        System.out.println(this.major);
    }

    void showAge() {
        System.out.println(this.age);
    }

    private void showGpa() {
        System.out.println(this.name);
    }
}
