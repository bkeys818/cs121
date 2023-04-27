//******************************************************************
//  Activity 25
//  Name: Ben Keys
//  Data Structures Date: 03/20/2023
//******************************************************************
//  A demonstration of the selection sorting algorithm.
//******************************************************************

public class QuickSort {
    public int[] sortArray(int[] array) {
        return sortArray(array, 0, array.length - 1);
    }
    private int[] sortArray(int[] array, int start, int end) {
        int pivot = partition(array, start, end);
        if (start < pivot - 1) {
            sortArray(array, start, pivot - 1);
        }
        if (end > pivot) {
            sortArray(array, pivot, end);
        }
        return array;
    }

    private int partition(int[] array, int start, int end) {
        int i = start, j = end, temp;
        int pivot = array[(end + start) / 2];
        // Everything to the left of pivot needs to be less than pivot and vise-versa.
        while (i <= j) {
            // Skips all values on the left that are already less than pivot.
            while (array[i] < pivot) {
                i ++;
            }
            // Skips all values on the right that are already more than pivot.
            while (array[j] > pivot) {
                j --;
            }

            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i ++;
                j --;
            }
        }
        return i;
    }
}
