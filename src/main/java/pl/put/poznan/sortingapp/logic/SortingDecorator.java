package pl.put.poznan.sortingapp.logic;

public class SortingDecorator implements SortingAlgorithm{

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
}
