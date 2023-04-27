//******************************************************************
//  Activity 3
//  Name: Ben Keys
//  Data Structures Date: 01/20/2023
//******************************************************************
//  Ask the user to input a country from a given list, and then
//  print's out the minimum wage of that country.
//******************************************************************

import java.util.Scanner;

public class SwitchActivity {
    public static void main(String[] args) {
        System.out.println("To find out it's minimum wage, please pick a country from the following list:");
        System.out.println("\tAmerica | Canada | Australia | Germany");

        System.out.print("Country: ");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        switch (country) {
            case ("America"):
                System.out.println("Minimum wage: $7.25 (USD)");
                break;
            case ("Canada"):
                System.out.println("Minimum wage: $9.52 (USD)");
                break;
            case ("Australia"):
                System.out.println("Minimum wage: $12.14 (USD)");
                break;
            case ("Germany"):
                System.out.println("Minimum wage: $10.87 (USD)");
                break;
            default:
                System.out.printf("Invalid: \"%s\" isn't a valid option.\n", country);
        }

    }
}
