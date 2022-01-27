package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego QuickSort.
 */
public class QuickSort extends SortingStrategy {

    public QuickSort(InputList InputList) {
        super(InputList);
    }

    @Override
    /**
     * @param iterations liczba iteracji sortowania.
     */
    public String[] sortAsIntegers(int iterations) {
        String[] arr = this.listInput.getArr();
        String[] res = sortAsIntegersMQ(arr, 0, arr.length - 1, iterations, 0);
        return res;
    }

    @Override
    /**
     * @param iterations  liczba iteracji sortowania.
     */
    public String[] sortAsStrings(int iterations) {
        String[] arr = this.listInput.getArr();
        String[] res = sortAsStringsMQ(arr, 0, arr.length - 1, iterations, 0);
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
    public String[] sortAsStringsMQ(String[] arr, int begin, int end, int iterations, int licznik) {
        if (iterations <= 0) {
            iterations = 2147483647;
        }
        if (begin < end) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            int partitionIndex = partitionStrings(arr, begin, end);

            sortAsStringsMQ(arr, begin, partitionIndex - 1, iterations, licznik);
            sortAsStringsMQ(arr, partitionIndex + 1, end, iterations, licznik);
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
    public String[] sortAsIntegersMQ(String[] arr, int low, int high, int iterations, int licznik) {
        if (iterations <= 0) {
            iterations = 2147483647;
        }
        if (low < high) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            int partitionIndex = partitionIntegers(arr, low, high);

            sortAsStringsMQ(arr, low, partitionIndex - 1, iterations, licznik);
            sortAsStringsMQ(arr, partitionIndex + 1, high, iterations, licznik);
        }
        return arr;
    }

    private int partitionIntegers(String[] arr, int begin, int end) {
        String pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (Integer.parseInt(arr[j]) <= Integer.parseInt(pivot)) {
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

    private int partitionStrings(String[] arr, int begin, int end) {
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
