package pl.put.poznan.sortingapp.logic;

import java.util.Arrays;

public class QuickSort {

    /**
     * Sorts given array of integers with quick sort
     * @param array Unsorted array of integers
     * @param low First value
     * @param high Last value
     */
    public static void sort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(array, low, j);

        if (high > i)
            sort(array, i, high);
    }
}
