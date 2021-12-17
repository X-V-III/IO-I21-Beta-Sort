package pl.put.poznan.sortingapp.logic;

public class BubbleSort {

    /**
     * Sorts given array of integers with bubble sort
     * @param arr Unsorted array of integers
     * @throws IllegalArgumentException When given array is empty, throws IllegalArgumentException
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