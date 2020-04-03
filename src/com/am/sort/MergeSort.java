package com.am.sort;

/**
 * source: https://www.geeksforgeeks.org/merge-sort/
 * Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves,
 * calls itself for the two halves and then merges the two sorted halves.
 * The merge() function is used for merging two halves.
 * The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r]
 * are sorted and merges the two sorted sub-arrays into one.
 *
 *See following C implementation for details.
 * MergeSort(arr[], l,  r)
 * If r > l
 *      1. Find the middle point to divide the array into two halves:
 *              middle m = (l+r)/2
 *      2. Call mergeSort for first half:
 *              Call mergeSort(arr, l, m)
 *      3. Call mergeSort for second half:
 *              Call mergeSort(arr, m+1, r)
 *      4. Merge the two halves sorted in step 2 and 3:
 *              Call merge(arr, l, m, r)
 *
 * Time Complexity: O(n log n) as there are two nested loops.
 */
public class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; i++) {
            L[i] = arr[i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[i];
        }
        int i = 0, j = 0;

        int k = left;


    }


}
