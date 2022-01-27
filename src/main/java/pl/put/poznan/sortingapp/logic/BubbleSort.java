package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego BubbleSort.
 */
public class BubbleSort extends SortingStrategy {

    public BubbleSort(InputList InputList) {
        super(InputList);
    }

    /**
     * Metoda sortujace podany ciag obiektow typu String jako Integer.
     * @return Posortowany ciag obiektow.
     * @param iterations  liczba iteracji sortowania.
     */
    @Override
    public String[] sortAsIntegers(int iterations) {
        int i, j;
        int licznik = 0;

        if (iterations <= 0) {
            iterations = 1000000000;
        }
        String[] arr = this.listInput.getArr();
        String swap;
        for (i = 0; i < arr.length; i++) {
            licznik++;
            if (licznik >= iterations) {
                return arr;
            }
            for (j = 0; j < arr.length - 1; j++) {
                if (Integer.parseInt(arr[j]) > Integer.parseInt(arr[j + 1])) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;
    }

    /**
     * Metoda sortujaca podany ciag obiektow typu String jako String.
     * @return Posortowany ciag obiektow.
     * @param iterations  liczba iteracji sortowania.
     */
    @Override
    public String[] sortAsStrings(int iterations) {
        String tempString;
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
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    tempString = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempString;
                }
            }
        }
        return arr;
    }
}
