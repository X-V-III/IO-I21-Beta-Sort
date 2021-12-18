package pl.put.poznan.sortingapp.app;

import pl.put.poznan.sortingapp.logic.*;

import static pl.put.poznan.sortingapp.util.Utils.printArray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Klasa SortingApplication zawierajaca glowna metode rozruchowa main.
 *
 * @author
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = {"pl.put.poznan.sortingapp.rest"})
public class SortingApplication {

    /**
     * Glowna metoda rozruchowa aplikacji. Rozpoczyna prace serwera z pomoca biblioteki Spring. Inicjuje obiekty potrzebne do dzialania.
     *
     * @param args Domyslny parametr metody main().
     */
    public static void main(String[] args) {
        SpringApplication.run(pl.put.poznan.sortingapp.app.SortingApplication.class, args);
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] arrHeap = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrBubble = {5, 6, 2, 1, 4};
        int[] arrQuick = {24, 5, 3, 35, 14, 23, 19, 43, 2};

        int lowQuick = 0;
        int highQuick = arrQuick.length - 1;

        try {
            //Merge Sort
            System.out.println("Merge Sort Given Array");
            printArray(arr);

            MergeSort ob = new MergeSort();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("\nMerge Sort Sorted Array");
            printArray(arr);

            //HeapSort
            System.out.println("\nHeap Sort Given Array");
            printArray(arrHeap);

            HeapSort.sort(arrHeap);

            System.out.println("\nHeap Sort Sorted Array");
            printArray(arrHeap);

            //BubbleSort
            System.out.println("\nBubble Sort Given Array");
            printArray(arrBubble);

            BubbleSort.sort(arrBubble);

            System.out.println("\nBubble Sort Sorted Array");
            printArray(arrBubble);

            //QuickSort
            System.out.println("\nQuick Sort Given Array");
            printArray(arrQuick);

            QuickSort.sort(arrQuick, lowQuick, highQuick);

            System.out.println("\nQuick Sort Sorted Array");
            printArray(arrQuick);

            //Empty list exception
            InsertionSort.sort(new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("\nGiven array is empty");
            e.printStackTrace();
        }

    }
}
