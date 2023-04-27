//******************************************************************
//  Activity 10
//  Name: Ben Keys
//  Data Structures Date: 02/07/2023
//******************************************************************
//  Writes provided values to `courses.tsv`.
//******************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("courses.tsv");
        PrintWriter writer = new PrintWriter(file);

        writer.println("course\tcredits\tgrade");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many courses are you taking? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nCourse " + (i + 1));
            System.out.print("Course code: ");
            String name = scanner.next();
            System.out.print("Credits: ");
            int credits = scanner.nextInt();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            writer.printf("%s\t%d\t%.1f\n", name, credits, grade);
        }

        writer.close();
    }
}
