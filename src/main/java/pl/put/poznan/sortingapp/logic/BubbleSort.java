package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego BubbleSort.
 */
public class BubbleSort {

    /**
     * Metoda sortujace podany ciag obiektow algorytmem BubbleSort.
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
}