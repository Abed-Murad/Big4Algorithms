package com.am.sort;

/**
 * source: https://www.geeksforgeeks.org/Insertion-sort/
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * <p>
 * Algorithm
 * <p>
 * 1- insertionSort(arr, n)
 * <p>
 * 2- Loop from i = 1 to n-1.
 * <p>
 * 3- Pick element arr[i] and insert it into sorted sequence arr[0…i-1]
 * <p>
 * <p>
 * Example:
 * 12, 11, 13, 5, 6
 * <p>
 * Let us loop for i = 1 (second element of the array) to 4 (last element of the array)
 * <p>
 * i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
 * 11, 12, 13, 5, 6
 * <p>
 * i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
 * 11, 12, 13, 5, 6
 * <p>
 * i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
 * 5, 11, 12, 13, 6
 * <p>
 * i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
 * 5, 6, 11, 12, 13
 * <p>
 * <p>
 * Time Complexity: O(n2) as there are two nested loops.
 */

public class InsertionSort {
    /* Function to sort array using insertion sort */
    /* Use the DEBUGGER to understand this algorithm flow faster! */
    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            // key is the item that we want to find a place to insert it in.
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }


}
