//******************************************************************
//  Activity 8
//  Name: Ben Keys
//  Data Structures Date: 01/30/2023
//******************************************************************
//  Averages the test score for each student.
//******************************************************************

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();
        System.out.print("Enter the number of test per students: ");
        int testCount = scanner.nextInt();

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nStudent #" + i + 1);
            System.out.println("---------------");
            float total = 0;
            int ii;
            for (ii = 0; ii < testCount; ii++) {
                System.out.printf("Enter score %d: ", ii + 1);
                total += (float)scanner.nextInt();
            }
            System.out.printf("The average score for student %d is %.2f\n", i + 1, total / ii);
        }
    }
}
