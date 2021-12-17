package pl.put.poznan.sortingapp.app;

import pl.put.poznan.sortingapp.logic.*;
import static pl.put.poznan.sortingapp.util.Utils.printArray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//zakomentowane chwilowo
@SpringBootApplication(scanBasePackages = {"pl.put.poznan.sortingapp.rest"})
public class SortingApplication {

    // Driver code
    public static void main(String[] args)
    {
        SpringApplication.run(pl.put.poznan.sortingapp.app.SortingApplication.class, args);
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        int[] arrHeap = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrBubble = {3,2,1,5,1,2,6,6,8,4,9,12 ,0 ,34, 34,6,1,100};
        int[] emptyArray = {};

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

            //Empty list exception
            SelectionSort.sort(emptyArray);

        } catch (IllegalArgumentException e) {
            System.out.println("\nGiven array is empty");
            e.printStackTrace();
        }
    }
}
