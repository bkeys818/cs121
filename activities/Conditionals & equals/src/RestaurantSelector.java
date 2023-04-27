//******************************************************************
//  Activity _
//  Name: Ben Keys
//  Data Structures Date: 01/20/2023
//******************************************************************
//  User is asked if anyone has dietary restrictions, and then
//  provides a list of places the party can go.
//******************************************************************

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is anyone in your party a vegetarian? (y/n): ");
        boolean isVegetarian = scanner.nextLine().equalsIgnoreCase("y");
        System.out.print("Is anyone in your party a vegan? (y/n): ");
        boolean isVegan = scanner.nextLine().equalsIgnoreCase("y");
        System.out.print("Is anyone in your party a gluten free? (y/n): ");
        boolean isGlutenFree = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("Here are your restaurant choices:");
        if (!isVegan) {
            System.out.println("\tMain Street Pizza Company");
            if (!isGlutenFree) {
                System.out.println("\tMama’s Fine Italian");
                if (!isVegetarian) {
                    System.out.println("\tJoe’s Gourmet Burgers");
                }
            }
        }
        System.out.println("\tCorner Café");
        System.out.println("\tThe Chef’s Kitchen");
    }
}
