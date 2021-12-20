package pl.put.poznan.sortingapp.logic;

import java.util.Arrays;

/**
 * Klasa bedaca implementacja algorytmu sortujacego QuickSort.
 */
public class QuickSort {

    /**
     * Sortuje podany ciag obiektow algorytmem QuickSort.
     * @param array Nieposortowany ciag obiektow.
     * @param low Pierwszy wartosc.
     * @param high Druga wartosc.
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

    ////////////////////////////////
    public static String[] sortString(String[] array) {
        sortStrings(array, 0, array.length - 1);
        return array;
    }

    private static void sortStrings(String[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortStrings(arr, begin, partitionIndex-1);
            sortStrings(arr, partitionIndex+1, end);
        }
    }

    private static int partition(String[] arr, int begin, int end) {
        String pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                String swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        String swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
