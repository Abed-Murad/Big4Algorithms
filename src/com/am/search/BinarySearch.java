package com.am.search;

/**
 * 1- Compare x with the middle element.
 * 2- If x matches with middle element, we return the mid index.
 * 3- Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element.
 * So we recur for right half.
 * 4- Else (x is smaller) recur for the left half.
 *
 * Time complexity = O(Log n).
 */

// Java implementation of recursive Binary Search
public class BinarySearch {

    // Returns index of x if it is present in arr[left..right], else return -1
    private int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int length = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, length - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }


}

