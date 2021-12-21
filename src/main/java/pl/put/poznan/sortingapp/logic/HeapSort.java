package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedąca implementacją algorytmu sortującego HeapSort.
 */
public class HeapSort {
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

    private static void sortAsIntegers(String[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyInteger(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyInteger(arr, i, 0);
        }
    }

    private static void heapifyInteger(String[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && Integer.parseInt(arr[l]) > Integer.parseInt(arr[largest]))
            largest = l;

        if (r < n && Integer.parseInt(arr[r]) > Integer.parseInt(arr[largest]))
            largest = r;

        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapifyInteger(arr, n, largest);
        }
    }

    private static void sortAsStrings(String[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyString(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyString(arr, i, 0);
        }
    }

    private static void heapifyString(String[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l].compareTo(arr[largest]) > 0)
            largest = l;

        if (r < n && arr[r].compareTo(arr[largest]) > 0)
            largest = r;

        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapifyString(arr, n, largest);
        }
    }
}
