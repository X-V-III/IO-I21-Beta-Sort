package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego MergeSort.
 */
public class MergeSort extends SortingDecorator{

    public MergeSort(InputList InputList) {
        super(InputList);
    }


    /**
     * Metoda, sluzaca dla przeprowadzenia iteracji algorytmu Merge Sort dla Integer
     * @param arr Nieposortowany ciag obiektow.
     */
    private void mergeInteger(String[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (Integer.parseInt(L[i]) <= Integer.parseInt(R[j])) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Metoda, sluzaca dla przeprowadzenia iteracji algorytmu Merge Sort dla String
     * @param arr Nieposortowany ciag obiektow.
     */
    private void mergeString(String[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    @Override
    public String[] sortAsIntegers() {
        String[] arr = this.listInput.getArr();
        String[] res = sortAsIntegersMQ(arr, 0, arr.length - 1);
        return res;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param arr Nieposortowany ciag obiektow.
     * @param l Index początku sortowania.
     * @param r Indeks końcu sortowania.
     * @return Posortowany ciag obiektow.
     */
    public String[] sortAsIntegersMQ(String[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r-l)/2;

            sortAsIntegersMQ(arr, l, m);
            sortAsIntegersMQ(arr, m + 1, r);

            mergeInteger(arr, l, m, r);
        }
        return arr;
    }

    @Override
    public String[] sortAsStrings() {
        String[] arr = this.listInput.getArr();
        String[] res = sortAsStringsMQ(arr, 0, arr.length - 1);
        return res;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @param arr Nieposortowany ciag obiektow.
     * @param l Index początku sortowania.
     * @param r Indeks końcu sortowania.
     * @return Posortowany ciag obiektow.
     */
    public String[] sortAsStringsMQ(String[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r-l)/2;

            sortAsStringsMQ(arr, l, m);
            sortAsStringsMQ(arr, m + 1, r);

            mergeString(arr, l, m, r);
        }
        return arr;
    }
}
