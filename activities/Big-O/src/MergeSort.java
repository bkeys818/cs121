//******************************************************************
//  Activity 25
//  Name: Ben Keys
//  Data Structures Date: 03/20/2023
//******************************************************************
//  A demonstration of the merge sorting algorithm.
//******************************************************************

public class MergeSort {
    public int[] sortArray(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int[] leftArray = new int[array.length / 2];
        int[] rightArray = new int[array.length - leftArray.length];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[leftArray.length + i];
        }

        sortArray(leftArray);
        sortArray(rightArray);
        return merge(leftArray, rightArray, array);
    }

    private int[] merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[arrayIndex] = leftArray[leftIndex];
                leftIndex ++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex ++;
            }
            arrayIndex ++;
        }

        while(leftIndex < leftArray.length) {
            array[arrayIndex] = leftArray[leftIndex];
            leftIndex ++;
            arrayIndex ++;
        }

        while(rightIndex < rightArray.length) {
            array[arrayIndex] = rightArray[rightIndex];
            rightIndex ++;
            arrayIndex ++;
        }

        return array;
    }
}
