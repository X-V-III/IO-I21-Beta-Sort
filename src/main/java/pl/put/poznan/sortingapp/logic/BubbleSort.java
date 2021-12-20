package pl.put.poznan.sortingapp.logic;

import pl.put.poznan.sortingapp.util.Utils;

/**
 * Klasa bedaca implementacja algorytmu sortujacego BubbleSort.
 */
public class BubbleSort {

    /**
     * Metoda sortujace podany ciag obiektow typu int algorytmem BubbleSort.
     * @param arr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     */
    public static void sort(int[] arr) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        int i, j , swap;
        for(i = 0; i < arr.length; i ++){
            for(j = 0; j < arr.length - 1  ;j++){
                if(arr[j] > arr[j+1]){
                    swap = arr[j];        // Umieść większy numer w swap
                    arr[j] = arr[j+1];    // place the smaller number
                    arr[j+1] = swap;
                }
            }
        }
    }



    /**
     * Metoda sortujace podany ciag obiektow typu String algorytmem BubbleSort.
     * @param stringArr Nieposortowany ciag obiektow.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     */
    public static String[] sortString(String[] stringArr) throws IllegalArgumentException {

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