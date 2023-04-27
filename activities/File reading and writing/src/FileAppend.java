//******************************************************************
//  Activity 10
//  Name: Ben Keys
//  Data Structures Date: 02/07/2023
//******************************************************************
//  Appends provided values to `courses.tsv`.
//******************************************************************

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("courses.tsv", true);
        PrintWriter writer = new PrintWriter(file);

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many courses would you like to add? ");
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
