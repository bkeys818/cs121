//******************************************************************
//  Activity 16
//  Name: Ben Keys
//  Data Structures Date: 02/13/2023
//******************************************************************
//  Demonstration of a multidimensional array.
//******************************************************************

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 2, 4, 6, 8 },
                { 3, 6, 9, 12 },
                { 4, 8, 12, 16 }
        };

        for (int[] row : arr) {
            for (int cell : row) {
                System.out.printf("%-2d ", cell);
            }
            System.out.println();
        }
    }
}
