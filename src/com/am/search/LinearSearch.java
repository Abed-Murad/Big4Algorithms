package com.am.search;

// Java code for linearly searching x in array[].
// if x is present then return it's location, otherwise return -1.
// Time complexity of below algorithm is O(n)
public class LinearSearch {
    private static int search(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int x = 30;
        int result = search(array, x);
        if (result == -1)
            System.out.println("Element is not present in array ");
        else
            System.out.println("Element is present at index " + result);
    }
}
