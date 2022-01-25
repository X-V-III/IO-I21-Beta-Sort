package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedąca implementacją algorytmu sortującego HeapSort.
 */
public class HeapSort extends SortingDecorator {

    public HeapSort(InputList InputList) {
        super(InputList);
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @return Posortowany ciag obiektow.
     */
    @Override
    public String[] sortAsIntegers() {
        String[] arr = this.listInput.getArr();
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyInteger(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyInteger(arr, i, 0);
        }
        return arr;
    }

    /**
     * Metoda, sluzaca dla przeprowadzenia iteracji algorytmu Heap Sort dla Integer
     * @param arr Nieposortowany ciag obiektow.
     */
    private void heapifyInteger(String[] arr, int n, int i) {
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

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @return Posortowany ciag obiektow.
     */
    @Override
    public String[] sortAsStrings() {
        String[] arr = this.listInput.getArr();
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapifyString(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyString(arr, i, 0);
        }
        return arr;
    }

    /**
     * Metoda, sluzaca dla przeprowadzenia iteracji algorytmu Heap Sort dla String
     * @param arr Nieposortowany ciag obiektow.
     */
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
