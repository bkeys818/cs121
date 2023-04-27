//******************************************************************
//  Activity 25
//  Name: Ben Keys
//  Data Structures Date: 03/20/2023
//******************************************************************
//  A short description of the program.
//******************************************************************

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static private int[] getArray() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 5 integers on different lines:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] unsortedArr = getArray();
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(unsortedArr));

        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleSorted = bubbleSort.sortArray(unsortedArr.clone());
        System.out.print("Bubble sort: ");
        System.out.println(Arrays.toString(bubbleSorted));

        MergeSort mergeSort = new MergeSort();
        int[] mergeSorted = mergeSort.sortArray(unsortedArr.clone());
        System.out.print("Merge sort: ");
        System.out.println(Arrays.toString(mergeSorted));

        SelectionSort selectionSort = new SelectionSort();
        int[] selectionSorted = selectionSort.sortArray(unsortedArr.clone());
        System.out.print("Selection sort: ");
        System.out.println(Arrays.toString(selectionSorted));

        InsertionSort insertionSort = new InsertionSort();
        long startTime = System.nanoTime();
        int[] insertionSorted = insertionSort.sortArray(unsortedArr.clone());
        long duration = System.nanoTime() - startTime;
        System.out.println("Insertion sort duration: " + duration);
        System.out.print("Insertion sort: ");
        System.out.println(Arrays.toString(insertionSorted));

        QuickSort quickSort = new QuickSort();
        int[] quickSorted = quickSort.sortArray(unsortedArr.clone());
        System.out.print("Quick sort: ");
        System.out.println(Arrays.toString(quickSorted));

        BinarySearch binarySearch = new BinarySearch();
        int binarySearching = quickSorted[2];
        int binarySearched = binarySearch.searchArray(quickSorted, binarySearching);
        System.out.printf("Binary search (Index of %d): %d", binarySearching, binarySearched);
    }
}
