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
     * @param arr Nieposortowany ciag obiektow.
     * @return Posortowany ciag obiektow.
     */
    @Override
    public String[] sortAsStrings() {
        String[] arr = this.listInput.getArr();
        for (int i = 1; i < arr.length; ++i) {
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
     * @return Posortowany ciag obiektow.
     */
    @Override
    public String[] sortAsIntegers() {
        String[] arr = this.listInput.getArr();
        for (int i = 1; i < arr.length; ++i) {
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
