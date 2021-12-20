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


    //////////////////////////////////////////////////////////////////////////////
    public static void insertionSort(String[] elements, int lo, int hi, int d){
        for (int i = lo + 1; i <= hi; i++){
            for (int j = i; j > lo && elements[j].charAt(d) < elements[j-1].charAt(d); j--){
                swap(elements, j, j-1);
            }
        }
    }

    public static void sortString(String[] elements){
        insertionSort(elements,elements.length-1);
    }

    private static void insertionSort(String[] elements, int end){
        if(end >= 1){
            insertionSort(elements,end-1); //保证前n-1个元素有序

            int index = end;
            String tmp = elements[end];
            for (int i = 0; i <= end -1; i++){
                if (elements[i].compareTo(elements[end]) > 0){
                    index = i;
                    break;
                }
            }

            if (index == end) return;

            for (int i = end; i >= index + 1; i--){
                elements[i] = elements[i-1];
            }

            elements[index] = tmp;
        }
    }

    private static void swap(String[] ele, int i, int j){
        String tmp = ele[i];
        ele[i] = ele[j];
        ele[j] = tmp;
    }
}
