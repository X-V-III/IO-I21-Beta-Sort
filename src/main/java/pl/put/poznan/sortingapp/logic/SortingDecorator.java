package pl.put.poznan.sortingapp.logic;

public class SortingDecorator implements SortingAlgorithm{
    protected SortingAlgorithm listInput;

    public SortingDecorator(SortingAlgorithm textInput){
        this.listInput = listInput;
    }

    @Override
    public Object[] sortAsIntegers(String[] arr) {
        return this.listInput.sortAsIntegers(arr);
    }
}
