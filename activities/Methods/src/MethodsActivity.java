//******************************************************************
//  Activity _
//  Name: Ben Keys
//  Data Structures Date: 02/07/2023
//******************************************************************
//  Asks for values about a rectangle, and then displays the given
//  data.
//******************************************************************


import java.util.Scanner;

public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please provide the following values about a rectangle.");
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }

    public static double getLength() {
        System.out.print("Length: ");
        return scanner.nextDouble();
    }

    public static double getWidth() {
        System.out.print("Width: ");
        return scanner.nextDouble();
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static void displayData(double length, double width, double area) {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}
