package pl.put.poznan.sortingapp.logic;

import pl.put.poznan.sortingapp.util.Utils;

/**
 * Klasa bedaca implementacja algorytmu sortujacego InsertionSort.
 */
public class InsertionSort {

    /**
     * Sortuje podany ciag obiektow algorytmem InsertionSort.
     * @param arr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
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
     * Metoda sluzaca jako test dzialania klasy InsertionSort.
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
