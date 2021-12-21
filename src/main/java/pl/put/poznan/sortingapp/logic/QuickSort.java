package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego QuickSort.
 */
public class QuickSort {

    /**
     * Sortuje podany ciag obiektow typu String algorytmem QuickSort.
     *
     * @param array Nieposortowany ciag obiektow.
     * @param low   Pierwsza wartosc.
     * @param high  Ostatnia wartosc.
     * @param sortAs Sortować elementy jako obiekty jakiej klasy.
     */
    public static void sort(String[] array, int low, int high, String sortAs) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;
        if (sortAs.compareToIgnoreCase("String") == 0) {
            sortAsStrings(array);
        } else if (sortAs.compareToIgnoreCase("Integer") == 0) {
            sortAsIntegers(array, 0, array.length - 1);
        } else {
            throw new IllegalArgumentException();
        }


    }

    /**
     * Sorts arrray of Strings as Strings
     *  @param array Nieposortowany ciąg obiektow.
     */
    public static String[] sortAsStrings(String[] array) {
        sortStrings(array, 0, array.length - 1);
        return array;
    }

    private static void sortStrings(String[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sortStrings(arr, begin, partitionIndex - 1);
            sortStrings(arr, partitionIndex + 1, end);
        }
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

    /**
     * Sorts arrray of Strings as Integers
     */
    private static void sortAsIntegers(String[] array,int low, int high) {
        int middle = low + (high - low) / 2;
        int opora = Integer.parseInt(array[middle]);

        int i = low, j = high;
        while (i <= j) {
            while (Integer.parseInt(array[i]) < opora) {
                i++;
            }

            while (Integer.parseInt(array[i]) > opora) {
                j--;
            }

            if (i <= j) {
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }

        if (low < j)
            sortAsIntegers(array, low, j);

        if (high > i)
            sortAsIntegers(array, i, high);
    }
}
