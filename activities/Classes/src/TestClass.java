public class TestClass {
    public static void main(String[] args) {
        Student student = new Student("Ben", "Media", 21, 3.6);
        student.showInfo();
        Course course = new Course("Data Structures and Objects", "cs121", 4);
        course.showInfo();
    }
}
