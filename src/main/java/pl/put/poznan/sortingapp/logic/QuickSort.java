package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego QuickSort.
 */
public class QuickSort extends SortingDecorator {

    public QuickSort(InputList InputList) {
        super(InputList);
    }

    @Override
    /**
     * @param iterations  liczba iteracji sortowania.
     */
    public String[] sortAsIntegers(int iterations) {
        String[] arr = this.listInput.getArr();
        String[] res = sortAsIntegersMQ(arr, 0, arr.length - 1, iterations);
        return res;
    }

    @Override
    /**
     * @param iterations  liczba iteracji sortowania.
     */
    public String[] sortAsStrings(int iterations) {
        String[] arr = this.listInput.getArr();
        String[] res = sortAsStringsMQ(arr, 0, arr.length - 1, iterations);
        return res;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @param arr Nieposortowany ciag obiektow.
     * @param begin Index początku sortowania.
     * @param end Indeks końcu sortowania.
     * @param iterations  liczba iteracji sortowania.
     * @return Posortowany ciag obiektow.
     */
    public  String[] sortAsStringsMQ(String[] arr, int begin, int end, int iterations) {
        int licznik = 0;

        if (iterations <= 0) {
            iterations = 1000000000;
        }
        if (begin < end) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            int partitionIndex = partition(arr, begin, end);

            sortAsStringsMQ(arr, begin, partitionIndex - 1, iterations);
            sortAsStringsMQ(arr, partitionIndex + 1, end, iterations);
        }
        return arr;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     * @param low Index początku sortowania.
     * @param high Indeks końcu sortowania.
     * @param iterations  liczba iteracji sortowania.
     * @return Posortowany ciag obiektow.
     */
    public static String[] sortAsIntegersMQ(String[] arr, int low, int high, int iterations) {
        int middle = low + (high - low) / 2;
        int opora = Integer.parseInt(arr[middle]);
        /*int licznik = 0;

        if (iterations <= 0) {
            iterations = 1000000000;
        }*/

        int i = low, j = high;
        while (i <= j) {
            while (Integer.parseInt(arr[i]) < opora) {
                i++;
            }

            while (Integer.parseInt(arr[i]) > opora) {
                j--;
            }

            if (i <= j) {
                /*
                licznik++;
                if (licznik >= iterations) {
                    return arr;
                }*/
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sortAsIntegersMQ(arr, low, j, iterations);

        if (high > i)
            sortAsIntegersMQ(arr, i, high, iterations);
        return arr;
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
