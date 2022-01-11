package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego SelectionSort.
 */
public class SelectionSort implements SortingAlgorithm {

    /**
     * Sortuje podany ciag obiektow algorytmem SelectionSort.
     * @param arr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     *
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
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[min_index]) < 0)
                    min_index = j;

            String temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     * @return Posortowany ciag obiektow.
     */
    public static Object[] sortAsIntegers(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++)
                if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[min_index]))
                    min_index = j;

            String temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
