package pl.put.poznan.sortingapp.logic;

public class SortingDecorator implements SortingAlgorithm{

    protected InputList listInput;

    public SortingDecorator(InputList listInput){
        this.listInput = listInput;
    }

    public InputList getListInput() {
        return listInput;
    }

    /**
     * Metoda sortujace podany ciag obiektow typu int algorytmem BubbleSort.
     * @param sortAs Sortować elementy jako obiekty jakiej klasy.
     * @throws IllegalArgumentException Kiedy podany ciag jest pusty badz niepoprawny, konczymy bledem.
     */
    public void sort(String sortAs) throws IllegalArgumentException {
        String[] arr = this.listInput.getArr();
        // Throws an exception when arr is empty
        if (arr.length == 0) throw new IllegalArgumentException();

        if (sortAs.compareToIgnoreCase("String") == 0) {
            sortAsStrings();
        } else if (sortAs.compareToIgnoreCase("Integer") == 0) {
            sortAsIntegers();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String[] sortAsIntegers() {
        return this.listInput.getArr();
    }

    @Override
    public String[] sortAsStrings() {
        return this.listInput.getArr();
    }

//    @Override
//    public Object[] sortAsIntegersMQ(String[] arr, int l, int r){return this.listInput.sortAsIntegersMQ(arr, int l, int r);};
//
//    @Override
//    public Object[] sortAsStringsMQ(String[] arr, int l, int r){return this.listInput.sortAsStringsMQ(arr, int l, int r);};
}
