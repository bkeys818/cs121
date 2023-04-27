//******************************************************************
//  Activity 2
//  Name: Ben Keys
//  Data Structures Date: 01/17/23
//******************************************************************
//  This program ask for 3 test scores and prints out the average
//  grade and corresponding the letter grade.
//******************************************************************

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pointTotal = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a test score (0-100)");
            pointTotal += sc.nextInt();
        }

        int average = pointTotal / 3;
        System.out.println("Average score: " + average + "%");

        if (average > 90) {
            System.out.println("Letter Grade: A");
        } else if (average > 80) {
            System.out.println("Letter Grade: B");
        } else if (average > 70) {
            System.out.println("Letter Grade: C");
        } else if (average > 60) {
            System.out.println("Letter Grade: D");
        } else {
            System.out.println("Letter Grade: F");
        }
    }
}
