//******************************************************************
//  Activity 31
//  Name: Ben Keys
//  Data Structures Date: 03/31/2023
//******************************************************************
//  A demo of linked list.
//******************************************************************

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ben", "Keys", 1, "Media", "Junior", 3.2);
        Student student2 = new Student("Ava", "Wettrick", 2, "Journalism", "Senior", 3.6);

        student1.addCourse(0, "MDIA 321");
        student1.addCourse(1, "MDIA 201");
        student1.addCourse(2, "MDIA 420");
        student2.addCourse(0, "JOUR 314");
        student2.addCourse(1, "JOUR 211");
        student2.addCourse(2, "JOUR 401");

        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());

        student1.displayStudentCourses();
        student2.displayStudentCourses();

        student1.removeCourse(1);
        student2.removeCourse(0);

        student1.displayStudentCourses();
        student2.displayStudentCourses();
    }
}
