package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego InsertionSort.
 */
public class InsertionSort extends SortingDecorator {

    public InsertionSort(InputList listInput) {
        super(listInput);
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @param iterations  liczba iteracji sortowania.
     * @return Posortowany ciag obiektow.
     */
    @Override
    public String[] sortAsStrings(int iterations) {
        String[] arr = this.listInput.getArr();
        int licznik = 0;
        if (iterations <= 0) {
            iterations = 1000000000;
        }

        for (int i = 1; i < arr.length; ++i) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @param iterations  liczba iteracji sortowania.
     * @return Posortowany ciag obiektow.
     */
    @Override
    public String[] sortAsIntegers(int iterations) {
        String[] arr = this.listInput.getArr();
        int licznik = 0;
        if (iterations <= 0) {
            iterations = 1000000000;
        }

        for (int i = 1; i < arr.length; ++i) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            int key = Integer.parseInt(arr[i]);
            int j = i - 1;
            while (j >= 0 && Integer.parseInt(arr[j]) > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = String.valueOf(key);
        }
        return arr;
    }
}
