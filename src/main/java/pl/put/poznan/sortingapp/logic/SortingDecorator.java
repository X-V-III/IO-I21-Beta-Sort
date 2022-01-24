package pl.put.poznan.sortingapp.logic;

public abstract class SortingDecorator implements SortingAlgorithm{

    protected SortingAlgorithm listInput;

    public SortingDecorator(SortingAlgorithm listInput){
        this.listInput = listInput;
    }

    public SortingAlgorithm getListInput() {
        return listInput;
    }

    @Override
    public Object[] sortAsIntegers(String[] arr) {
        return this.listInput.sortAsIntegers(arr);
    }

    @Override
    public Object[] sortAsStrings(String[] arr) {
        return this.listInput.sortAsStrings(arr);
    }

    @Override
    public Object[] sortAsIntegersMQ(String[] arr, int l, int r){return this.listInput.sortAsIntegersMQ(arr, int l, int r);};

    @Override
    public Object[] sortAsStringsMQ(String[] arr, int l, int r){return this.listInput.sortAsStringsMQ(arr, int l, int r);};
}
