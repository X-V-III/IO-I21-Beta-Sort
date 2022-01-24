package pl.put.poznan.sortingapp.logic;

public class InputList implements SortingAlgorithm{
    protected String[] arr;


    public String[] getText() {
        return arr;
    }

    public InputList(String[] arr){
        this.arr = arr;
    }

    @Override
    public String[] sortAsIntegers(String[] arr) {
        return this.arr;
    }
}
