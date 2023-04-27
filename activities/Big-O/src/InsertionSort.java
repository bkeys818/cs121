//******************************************************************
//  Activity 25
//  Name: Ben Keys
//  Data Structures Date: 03/20/2023
//******************************************************************
//  A demonstration of the insertion sorting algorithm.
//******************************************************************

public class InsertionSort {
    public int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                    // Does adding break here improve the time complexity at all?
                    break;
                }
            }
        }
        return array;
    }
}
