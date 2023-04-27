//******************************************************************
//  Activity _
//  Name: Ben Keys
//  Data Structures Date: 01/20/2023
//******************************************************************
//  User is ask for the length of 3 sides of a triangle, and then
//  told whether the triangle is scalene, isosceles, or equilateral.
//******************************************************************

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        System.out.println("Please enter the length of every side of a triangle");

        Scanner scanner = new Scanner(System.in);
        float side1, side2, side3;

        System.out.print("Length of side 1: ");
        side1 = scanner.nextFloat();
        System.out.print("Length of side 2: ");
        side2 = scanner.nextFloat();
        System.out.print("Length of side 3: ");
        side3 = scanner.nextFloat();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It's a scalene triangle!");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("It's an isosceles triangle!");
        } else {
            System.out.println("It's an equilateral triangle!");
        }
    }
}
