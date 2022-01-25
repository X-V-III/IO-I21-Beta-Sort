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
     */
    @Override
    public String[] sortAsStrings() {
        String[] arr = this.listInput.getArr();
        for (int i = 0; i < arr.length - 1; i++) {
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
     */
    @Override
    public String[] sortAsIntegers() {
        String[] arr = this.listInput.getArr();
        for (int i = 0; i < arr.length - 1; i++) {
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
