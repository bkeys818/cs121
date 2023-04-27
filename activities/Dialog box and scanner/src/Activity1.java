//******************************************************************
//  Activity 1
//  Name: Ben Keys
//  Data Structures Date: 01/17/23
//******************************************************************
//  Fist, this program ask you for your first and last name, and
//  prints it in a series of manipulated ways. Next, it as for
//  two integers, and prints the results of a series of operations.
//******************************************************************

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Performs a series of manipulations on the provided string and operations on the provided integers.
 */
public class Activity1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your first name.")
                + " "
                + JOptionPane.showInputDialog("Enter your last name.");

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String reverseName = sb.toString();

        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Reverse: " + reverseName);

        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        num1 = scanner.nextInt();
        System.out.println("Please enter another number.");
        num2 = scanner.nextInt();

        System.out.printf("Add: %d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("Subtract: %d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("Multiply: %d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("Divide: %d / %d = %f\n", num1, num2, (float) num1 / num2);
        System.out.printf("Square Root %d = %f\n", num1, Math.sqrt(num1));
        System.out.printf("Square Root %d = %f\n", num2, Math.sqrt(num2));
        System.out.printf("Power: %d ^ %d = %f\n", num1, num2, Math.pow(num1, num2));
        System.out.printf("Logarithm %d = %f\n", num1, Math.log(num1));
        System.out.printf("Logarithm %d = %f\n", num2, Math.log(num2));
    }
}
