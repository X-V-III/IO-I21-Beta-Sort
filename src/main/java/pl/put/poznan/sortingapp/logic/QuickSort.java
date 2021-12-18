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
}
