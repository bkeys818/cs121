package packagesDemo;

public class TestClass {
    public static void main(String[] args) {
        Student student = new Student("Ben Keys", "Media", 21, 3.7);
        System.out.println(student.name);
//        System.out.println(student.major);
        System.out.println(student.age);
//        System.out.println(student.gpa);
        student.showName();
        student.showMajor();
        student.showAge();
//        student.showGpa();
    }
}
