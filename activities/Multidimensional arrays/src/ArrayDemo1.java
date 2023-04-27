//******************************************************************
//  Activity 16
//  Name: Ben Keys
//  Data Structures Date: 02/13/2023
//******************************************************************
//  Demonstration of a multidimensional array.
//******************************************************************

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                arr[i][ii] = (i + 1) * (ii + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int ii = 0; ii < arr[i].length; ii++) {
                System.out.printf("%-2d ", arr[i][ii]);
            }
            System.out.println();
        }
    }
}
