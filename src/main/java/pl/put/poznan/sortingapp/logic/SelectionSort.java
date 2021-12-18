package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego SelectionSort.
 */
public class SelectionSort {

    /**
     * Sortuje podany ciag obiektow algorytmem SelectionSort.
     * @param arr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     *
     */
    public static void sort(int[] arr) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        for (int i = 0; i < arr.length-1; i++)
        {
            int min_index = i;

            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
