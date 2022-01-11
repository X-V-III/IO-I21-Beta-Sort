package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego BubbleSort.
 */
public class BubbleSort implements SortingAlgorithm {

    /**
     * Metoda sortujace podany ciag obiektow typu int algorytmem BubbleSort.
     * @param arr Nieposortowany ciag obiektow.
     * @param sortAs Sortować elementy jako obiekty jakiej klasy.
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
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     * @return Posortowany ciag obiektow.
     */
    public static Object[] sortAsIntegers(String[] arr) {
        int i, j;
        String swap;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j + 1])) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }

    /**
     * Metoda sortujaca podany ciag obiektow typu String jako String.
     * @param stringArr Nieposortowany ciag obiektow.
     * @return Posortowany ciag obiektow.
     */
    public static String[] sortAsStrings(String[] stringArr) {
        String tempString;
        for (int i = 0; i < stringArr.length - 1; i++) {
            for (int j = 0; j < stringArr.length - 1; j++) {
                if (stringArr[j].compareTo(stringArr[j + 1]) > 0) {
                    tempString = stringArr[j];
                    stringArr[j] = stringArr[j + 1];
                    stringArr[j + 1] = tempString;
                }
            }
        }
        return stringArr;
    }
}
