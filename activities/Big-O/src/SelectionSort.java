//******************************************************************
//  Activity 25
//  Name: Ben Keys
//  Data Structures Date: 03/20/2023
//******************************************************************
//  A demonstration of the selection sorting algorithm.
//******************************************************************

public class SelectionSort {
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
