//******************************************************************
//  Activity 27
//  Name: Ben Keys
//  Data Structures Date: 03/22/2023
//******************************************************************
//  A demonstration of the binary search algorithm.
//******************************************************************

public class BinarySearch {
    public int searchArray(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;

        while (low <= high && array[mid] != element) {
            if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
            mid = (low + high) / 2;
        }

        if (low > high) {
            return -1;
        }
        return mid;
    }
}
