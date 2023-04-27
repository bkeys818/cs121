import java.util.LinkedList;

public class Student {
    public String firstName;
    public String lastName;
    public int id;
    public String major;
    public String classStanding;
    public double gpa;
    private LinkedList<String> courseList = new LinkedList<>();

    Student(String firstName, String lastName, int id, String major, String classStanding, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
    }

    void addCourse(int i, String e) {
        courseList.add(i, e);
    }
    void removeCourse(int i) {
        courseList.remove(i);
    }
    String getStudentInfo() {
        return "First name: " + firstName +
        "\nLast name: " + lastName +
        "\nID: " + id +
        "\nMajor: " + major +
        "\nClass standing: " + classStanding +
        "\nGPA: " + gpa;
    }
    void displayStudentCourses() {
        System.out.printf("Student %d courses:\n", id);
        for (String course : courseList) {
            System.out.println(course);
        }
    }
}
