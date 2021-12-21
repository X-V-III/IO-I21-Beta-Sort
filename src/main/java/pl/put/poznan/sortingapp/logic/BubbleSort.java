package pl.put.poznan.sortingapp.logic;

import pl.put.poznan.sortingapp.util.Utils;

/**
 * Klasa bedaca implementacja algorytmu sortujacego BubbleSort.
 */
public class BubbleSort {

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
     * Metoda sortujace podany ciag obiektow jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     */
    private static void sortAsIntegers(String[] arr) {
        int i, j;
        String swap;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j + 1])) {
                    swap = arr[j];        // Umieść większy numer w swap
                    arr[j] = arr[j + 1];    // place the smaller number
                    arr[j + 1] = swap;
                }
            }
        }
    }



    /**
     * Metoda sortujaca podany ciag obiektow typu String algorytmem BubbleSort.
     * @param stringArr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     */
    public static String[] sortAsStrings(String[] stringArr) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (stringArr.length == 0) throw new IllegalArgumentException();

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
