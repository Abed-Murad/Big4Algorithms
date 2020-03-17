package com.am.search;

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
