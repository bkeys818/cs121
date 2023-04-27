//******************************************************************
//  Activity 25
//  Name: Ben Keys
//  Data Structures Date: 03/20/2023
//******************************************************************
//  A demonstration of the bubble sorting algorithm.
//******************************************************************

public class BubbleSort {
    public int[] sortArray(int[] array) {
        int temp;
        // loop through entire array
        for (int i = 0; i < array.length - 1; i++) {
            // loop through the unsorted portion of the array
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
