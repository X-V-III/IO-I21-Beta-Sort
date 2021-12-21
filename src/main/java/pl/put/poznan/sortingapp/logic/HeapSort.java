package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedąca implementacją algorytmu sortującego HeapSort.
 */
public class HeapSort {
    private static String[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    /**
     * Metoda sortAsIntegers sluzaca do budowania sterty z nieposortowanego ciagu obiektow typu int.
     *
     * @param a Nieposortowany ciag obiektow.
     */
    public static void sortAsIntegers(String[] a) {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            //System.out.println(i);
            maxheap(a, i);
        }
    }

    /**
     * Metoda maxheap sluzaca dalszemu przetwarzaniu w algorytmie.
     *
     * @param a Przekazany ciag.
     * @param i Dodatkowy parametr metody maxheap.
     */
    public static void maxheap(String[] a, int i) {
        left = 2 * i;
        right = 2 * i + 1;
        //System.out.println(i + " " + left + " " + right);
        if (left <= n && Integer.parseInt(a[left]) > Integer.parseInt(a[i])) {
            largest = left;
        } else {
            largest = i;
        }

        if (right <= n && Integer.parseInt(a[right]) > Integer.parseInt(a[largest])) {
            largest = right;
        }
        if (largest != i) {
            exchange(i, largest);
            maxheap(a, largest);
        }
    }

    /**
     * Metoda exchange sluzaca do zamiany pozycji obiektow.
     *
     * @param i Pierwszy obiekt okreslonego typu.
     * @param j Drugi obiekt okreslonego typu.
     */
    public static void exchange(int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * Sortuje podany ciag obiektow algorytmem HeapSort.
     *
     * @param arr    Nieposortowany ciag obiektow.
     * @param sortAs Sortować elementy jako obiekty jakiej klasy.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     */
    public static void sort(String[] arr, String sortAs) throws IllegalArgumentException {

        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        if (sortAs.compareToIgnoreCase("String") == 0) {
            sortAsStrings(arr, arr.length);
        } else if (sortAs.compareToIgnoreCase("Integer") == 0) {
            sortAsIntegers(arr);
        } else {
            throw new IllegalArgumentException();
        }

        for (int i = n; i > 0; i--) {
            exchange(0, i);
            n = n - 1;
            maxheap(a, 0);
        }
    }


    //Nie działa jeszcze
    ///////////////////////////////////////////////////////////////////////////////////
    // sorting String by heapSort
    // Used for index in heap
    static int x = -1;

    // Predefining the heap array
    static String[] heap = new String[1000];

    // Defining formation of the heap
    static void heapForm(String k) {
        x++;

        heap[x] = k;

        int child = x;

        String tmp;

        int index = x / 2;

        // Iterative heapiFy
        while (index >= 0) {

            // Just swapping if the element
            // is smaller than already
            // stored element
            if (heap[index].compareTo(heap[child]) > 0) {

                // Swapping the current index
                // with its child
                tmp = heap[index];
                heap[index] = heap[child];
                heap[child] = tmp;
                child = index;

                // Moving upward in the
                // heap
                index = index / 2;
            } else {
                break;
            }
        }
    }

    // Defining heap sort
    static void heapSort() {
        int left1, right1;

        while (x >= 0) {
            String k;
            k = heap[0];

            // Taking output of
            // the minimum element
            System.out.print(k + " ");

            // Set first element
            // as a last one
            heap[0] = heap[x];

            // Decrement of the
            // size of the string
            x = x - 1;

            String tmp;

            int index = 0;

            int length = x;

            // Initializing the left
            // and right index
            left1 = 1;

            right1 = left1 + 1;

            while (left1 <= length) {

                // Process of heap sort
                // If root element is
                // minimum than its both
                // of the child then break
                if (heap[index].compareTo(heap[left1]) <= 0 &&
                        heap[index].compareTo(heap[right1]) <= 0) {
                    break;
                }

                // Otherwise checking that
                // the child which one is
                // smaller, swap them with
                // parent element
                else {

                    // Swapping
                    if (heap[left1].compareTo(heap[right1]) < 0) {
                        tmp = heap[index];
                        heap[index] = heap[left1];
                        heap[left1] = tmp;
                        index = left1;
                    } else {
                        tmp = heap[index];
                        heap[index] = heap[right1];
                        heap[right1] = tmp;
                        index = right1;
                    }
                }

                // Changing the left index
                // and right index
                left1 = 2 * left1;
                right1 = left1 + 1;
            }
        }
    }

    // Utility function
    static void sortAsStrings(String[] arr, int n) {

        // To heapiFy
        for (int i = 0; i < n; i++) {
            heapForm(arr[i]);
        }

        // Calling heap sort function
        heapSort();
    }
}
