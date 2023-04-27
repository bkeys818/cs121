//******************************************************************
//  Activity 2
//  Name: Ben Keys
//  Data Structures Date: 01/17/23
//******************************************************************
//  This program ask for the number of books read in a month and
//  then prints the number of points awarded.
//******************************************************************

import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args) {
        int bookCount = Integer.parseInt(JOptionPane.showInputDialog("How many books did you read this month?"));
        int points = bookCount == 0 ? 0 : bookCount == 1 ? 5 : bookCount == 2 ? 15 : bookCount == 3 ? 30 : 60;
        JOptionPane.showMessageDialog(null, "You earned " + points + " points.");
    }
}
