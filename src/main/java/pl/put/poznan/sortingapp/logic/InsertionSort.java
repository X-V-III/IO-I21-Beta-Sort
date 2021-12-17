package pl.put.poznan.sortingapp.logic;

import pl.put.poznan.sortingapp.util.Utils;

public class InsertionSort {

    /**
     * Sorts given array of integers with insertion sort
     * @param arr Unsorted array of integers
     * @throws IllegalArgumentException When given array is empty, throws IllegalArgumentException
     */
    public static void sort(int[] arr) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Gives a quick demonstration on a sample array
     */
    public static void quickTest() {
        int[] testArr = {4,3,2,1};
        System.out.println("Unsorted: ");
        Utils.printArray(testArr);
        sort(testArr);
        System.out.println("After insertion sort: ");
        Utils.printArray(testArr);
    }
}
