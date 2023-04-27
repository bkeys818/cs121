//******************************************************************
//  Activity 4
//  Name: Ben Keys
//  Data Structures Date: 01/20/2023
//******************************************************************
//  Prints whether a number is even or odd.
//******************************************************************

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
