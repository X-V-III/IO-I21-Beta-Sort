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
        //Sortowanie liczb
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] arrHeap = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrBubble = {5, 6, 2, 1, 4};
        int[] arrQuick = {24, 5, 3, 35, 14, 23, 19, 43, 2};

        //Sortowanie leksykalne
        String stringArrSelection[] = {"Pata", "Peter", "Andi", "Franki", "Olaf", "Asterix", "Laura", "Christoph", "Bernd", "Xena", "s", "k", "c", "r", "v", "n", "b", "f", "a", "d"};
        String stringArrBubble[] = {"Pata", "Peter", "Andi", "Franki", "Olaf", "Asterix", "Laura", "Christoph", "Bernd", "Xena", "s", "k", "c", "r", "v", "n", "b", "f", "a", "d"};


        int lowQuick = 0;
        int highQuick = arrQuick.length - 1;

        try {
            System.out.println("Selection Sort Given String Array");
            printArray(stringArrSelection);

            SelectionSort.sortString(stringArrSelection);

            System.out.println("\nSelection Sort Sorted String Array");
            printArray(stringArrSelection);

            /*
            //Merge Sort
            System.out.println("Merge Sort Given Array");
            printArray(arr);

            MergeSort ob = new MergeSort();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("\nMerge Sort Sorted Array");
            printArray(arr);

            //HeapSort
            //System.out.println("\nHeap Sort Given Array");
            //printArray(arrHeap);
            System.out.println("\nHeap Sort Given StringArray");
            printArray(stringArrHeap);

            HeapSort.sort(arrHeap);
            HeapSort.sortString(stringArrHeap);

            //System.out.println("\nHeap Sort Sorted Array");
            //printArray(arrHeap);
            System.out.println("\nHeap Sort Sorted String Array");
            printArray(stringArrHeap);


            //BubbleSort
            //System.out.println("\nBubble Sort Given Array");
            //printArray(arrBubble);
            //System.out.println("\nBubble Sort Given String Array");
            //printArray(stringArrBubble);

            BubbleSort.sort(arrBubble);
            BubbleSort.sortString(stringArrBubble);

            //System.out.println("\nBubble Sort Sorted Array");
            //printArray(arrBubble);
            System.out.println("\nBubble Sort Sorted String Array");
            printArray(stringArrBubble);

            //QuickSort
            //System.out.println("\nQuick Sort Given Array");
            //printArray(arrQuick);
            System.out.println("\nQuick Sort Given String Array");
            printArray(stringArrQuick);

            QuickSort.sort(arrQuick, lowQuick, highQuick);
            QuickSort.sortString(stringArrQuick);

            //System.out.println("\nQuick Sort Sorted Array");
            //printArray(arrQuick);
            System.out.println("\nQuick Sort Sorted Array");
            printArray(stringArrQuick);

            //Empty list exception
            //InsertionSort.sort(new int[]{});
            //*/
        } catch (IllegalArgumentException e) {
            System.out.println("\nGiven array is empty");
            e.printStackTrace();
        }

    }
}
