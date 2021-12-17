package pl.put.poznan.sortingapp.logic;

import java.util.Arrays;

public class QuickSort {
    /**
     * Sorts given array of integers with quick sort
     * @param array Unsorted array of integers
     * @param low First value
     * @param high Last value
     */

    public static void sortQuick(int[] array, int low, int high) {
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
            sortQuick(array, low, j);

        if (high > i)
            sortQuick(array, i, high);
    }
    /*
     //Gives a quick demonstration on a sample array
    public static void main(String[] args) {
        int[] x = { 24,5,3,35,14,23,19,43,2 };
        System.out.println("Given Array");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(x));
    }
    */
}
