package classArraylists;
//******************************************************************
//  Activity _
//  Name: Ben Keys
//  Data Structures Date: 02/13/2023
//******************************************************************
//  Input class information is printed out in a table.
//******************************************************************

import java.util.Scanner;

public class CourseInfoTest {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CourseInfo courseInfo = new CourseInfo();

        System.out.print("How many courses would you like to enter? ");
        final int L = scanner.nextInt();

        String name, letterGrade;
        float gpa, score;

        scanner.nextLine();
        for (int i = 0; i < L; i++) {
            System.out.println("\nCourse " + (i + 1));
            System.out.print("name: ");
            String input = scanner.nextLine();
            if (input.equals("q")) { break; }
            name = input;

            System.out.print("gpa: ");
            input = scanner.nextLine();
            if (input.equals("q")) { break; }
            gpa = Float.parseFloat(input);

            System.out.print("score: ");
            input = scanner.nextLine();
            if (input.equals("q")) { break; }
            score = Float.parseFloat(input);

            System.out.print("letter grade: ");
            input = scanner.nextLine();
            if (input.equals("q")) { break; }
            letterGrade = input;

            courseInfo.addClass(name, gpa, score, letterGrade);
        }
        courseInfo.display();

        scanner.close();
    }

    private static boolean userQuit() {
        return scanner.hasNext("q");
    }
}
