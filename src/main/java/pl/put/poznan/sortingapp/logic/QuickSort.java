package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego QuickSort.
 */
public class QuickSort {

    /**
     * Sortuje podany ciag obiektow typu String algorytmem QuickSort.
     * @param arr Nieposortowany ciag obiektow.
     * @param sortAs Sortować elementy jako obiekty jakiej klasy.
     */
    public static void sort(String[] arr, String sortAs) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        int low = 0;
        int high = arr.length - 1;

        if (low >= high)
            throw new IllegalArgumentException();
        if (sortAs.compareToIgnoreCase("String") == 0) {
            sortAsStrings(arr, low, high);
        } else if (sortAs.compareToIgnoreCase("Integer") == 0) {
            sortAsIntegers(arr, low, high);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @param arr Nieposortowany ciag obiektow.
     */
    private static void sortAsStrings(String[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortAsStrings(arr, begin, partitionIndex - 1);
            sortAsStrings(arr, partitionIndex + 1, end);
        }
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     */
    private static void sortAsIntegers(String[] arr,int low, int high) {
        int middle = low + (high - low) / 2;
        int opora = Integer.parseInt(arr[middle]);

        int i = low, j = high;
        while (i <= j) {
            while (Integer.parseInt(arr[i]) < opora) {
                i++;
            }

            while (Integer.parseInt(arr[i]) > opora) {
                j--;
            }

            if (i <= j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sortAsIntegers(arr, low, j);

        if (high > i)
            sortAsIntegers(arr, i, high);
    }

    private static int partition(String[] arr, int begin, int end) {
        String pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                String swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        String swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
