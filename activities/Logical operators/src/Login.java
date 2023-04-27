//******************************************************************
//  Activity 4
//  Name: Ben Keys
//  Data Structures Date: 01/20/2023
//******************************************************************
//  User is ask for a username and password, and the appropriate
//  response is given.
//******************************************************************

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String username = "user101";
        String password = "password123";

        String givenUsername = JOptionPane.showInputDialog("Please enter your username:");
        String givenPassword = JOptionPane.showInputDialog("Please enter your password:");

        if (username.equals(givenUsername) && password.equals(givenPassword)) {
            System.out.println("Welcome to CS121.");
        } else if (username.equals(givenUsername) || password.equals(givenPassword)) {
            System.out.printf("Oops: %s is incorrect!", (username.equals(givenUsername) ? "password" : "username"));
        } else {
            System.out.println("Oops: password and username are incorrect!");
        }
    }
}
