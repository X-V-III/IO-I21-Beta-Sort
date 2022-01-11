package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego InsertionSort.
 */
public class InsertionSort implements SortingAlgorithm {

    /**
     * Sortuje podany ciag obiektow typu String algorytmem InsertionSort.
     * @param arr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     */
    public static void sort(String[] arr, String sortAs) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        if (sortAs.compareToIgnoreCase("String") == 0) {
            sortAsStrings(arr);
        } else if (sortAs.compareToIgnoreCase("Integer") == 0) {
            sortAsIntegers(arr);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @param arr Nieposortowany ciag obiektow.
     * @return Posortowany ciag obiektow.
     */
    public static Object[] sortAsStrings(String[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     * @return Posortowany ciag obiektow.
     */
    public static Object[] sortAsIntegers(String[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = Integer.parseInt(arr[i]);
            int j = i - 1;
            while (j >= 0 && Integer.parseInt(arr[j]) > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = String.valueOf(key);
        }
        return arr;
    }
}
