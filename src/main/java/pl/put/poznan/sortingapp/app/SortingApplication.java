package pl.put.poznan.sortingapp.app;

import pl.put.poznan.sortingapp.logic.MergeSort;
import static pl.put.poznan.sortingapp.logic.MergeSort.printArray;

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

        System.out.println("Merge Sort Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nMerge Sort Sorted array");
        printArray(arr);
    }
}
