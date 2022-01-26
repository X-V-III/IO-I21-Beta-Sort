package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego SelectionSort.
 */
public class SelectionSort extends SortingDecorator {

    public SelectionSort(InputList listInput) {
        super(listInput);
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako String.
     * @return Posortowany ciag obiektow.
     * @param iterations  liczba iteracji sortowania.
     */
    @Override
    public String[] sortAsStrings(int iterations) {
        String[] arr = this.listInput.getArr();
        int licznik = 0;

        if (iterations <= 0) {
            iterations = 1000000000;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[min_index]) < 0)
                    min_index = j;

            String temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @return Posortowany ciag obiektow.
     * @param iterations  liczba iteracji sortowania.
     */
    @Override
    public String[] sortAsIntegers(int iterations) {
        String[] arr = this.listInput.getArr();
        int licznik = 0;

        if (iterations <= 0) {
            iterations = 1000000000;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++)
                if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[min_index]))
                    min_index = j;

            String temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
