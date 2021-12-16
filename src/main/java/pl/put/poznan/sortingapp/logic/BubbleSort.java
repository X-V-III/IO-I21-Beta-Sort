package pl.put.poznan.sortingapp.logic;

public class BubbleSort {

    public static void sortBubble(int []a0){

        int i, j , swap;

        //tablica do posortowania
        //int []arr = {3, 2, 1, 5, 1, 2, 6, 6, 8, 4, 9, 12, 0, 34, 34, 6, 1, 100};

        int []arr = a0;
        for(i = 0; i < arr.length; i ++){

            for(j = 0; j < arr.length - 1  ;j++){

                if(arr[j] > arr[j+1]){

                    swap = arr[j];        // Umieść większy numer w swap
                    arr[j] = arr[j+1];    // place the smaller number
                    arr[j+1] = swap;


                }
            }
        }

        //Display the sorted array
        //for(int x = 0 ; x < arr.length ; x ++){
        //    System.out.print(arr[x] + ", ");
        //}
    }
}