//******************************************************************
//  Activity 15
//  Name: Ben Keys
//  Data Structures Date: 02/13/2023
//******************************************************************
//  Input values are printed as a table.
//******************************************************************

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students would you like to enter? ");
        final int L = scanner.nextInt();

        String[] names = new String[L];
        int[] ages = new int[L];
        String[] majors = new String[L];

        int maxNameLength = 0;

        scanner.nextLine();
        for (int i = 0; i < L; i++) {
            System.out.println("\nStudent #" + (i + 1));
            System.out.print("name: ");
            names[i] = scanner.nextLine();
            System.out.print("age: ");
            ages[i] = scanner.nextInt();
            System.out.print("major: ");
            scanner.nextLine();
            majors[i] = scanner.nextLine();

            if (names[i].length() > maxNameLength) {
                maxNameLength = names[i].length();
            }
        }

        maxNameLength += 2;
        System.out.printf("\n%-" + maxNameLength + "s %-6s %s\n", "NAME", "AGE", "MAJOR");
        for (int i = 0; i < L; i++) {
            System.out.printf("%-" + maxNameLength + "s %-6d %s\n", names[i], ages[i], majors[i]);
        }
    }
}
