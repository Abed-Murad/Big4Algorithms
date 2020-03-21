package com.am.sort;

/**
 * source: https://www.geeksforgeeks.org/bubble-sort/
 *
 * Bubble Sort is the simplest sorting algorithm
 * that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * <p/>
 * Example:
 * First Pass:<p/>
 * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 >1.
 * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
 * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
 * <p>
 * Second Pass:
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
 * ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
 * <p>
 * Now, the array is already sorted, but our algorithm does not know if it is completed.
 * The algorithm needs one whole pass without any swap to know it is sorted.
 * <p>
 * Third Pass:
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * <p>
 * Time Complexity: O(n2) as there are two nested loops.
 */
public class BubbleSort {

    private void bubbleSort(int[] myArray) {
        int n = myArray.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    private void printArray(int[] arr) {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

}
