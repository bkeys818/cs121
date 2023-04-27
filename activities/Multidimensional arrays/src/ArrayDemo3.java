//******************************************************************
//  Activity 16
//  Name: Ben Keys
//  Data Structures Date: 02/13/2023
//******************************************************************
//  Demonstration of a multidimensional array.
//******************************************************************

public class ArrayDemo3 {
    public static void main(String[] args) {
        String[][] arr = {
                { "Ben", "Media", "Green", "Carmel" },
                { "Ava", "Journalism", "Teal", "Noblesville" }
        };

        for (String[] row : arr) {
            for (String cell : row) {
                System.out.print(cell + "  ");
            }
            System.out.println();
        }
    }
}
