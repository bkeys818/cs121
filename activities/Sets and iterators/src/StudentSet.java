//******************************************************************
//  Activity 28
//  Name: Ben Keys
//  Data Structures Date: 03/27/2023
//******************************************************************
//  A demonstration of how to use sets.
//******************************************************************

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class StudentSet {
    private final Set<String> students = new HashSet<>();

    public void addStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of students you'd like to add. Type \"q\" to quit.");

        String student = scanner.next();
        do {
            students.add(student);
            student = scanner.next();
        } while (!student.strip().equalsIgnoreCase("q"));
    }

    public void displayStudents() {
        Iterator<String> iterator = students.iterator();

        System.out.println("\nStudents:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
