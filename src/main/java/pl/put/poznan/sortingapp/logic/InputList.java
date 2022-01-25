package pl.put.poznan.sortingapp.logic;

public class InputList implements SortingAlgorithm {

    protected String[] arr;

    public String[] getArr() {
        return arr;
    }

    public InputList(String[] arr){
        this.arr = arr;
    }

    @Override
    public String[] sortAsIntegers(String[] arr) {
        return this.arr;
    }

    @Override
    public Object[] sortAsStrings(String[] arr) {
        return this.arr;
    }

//    @Override
//    public Object[] sortAsStringsMQ(String[] arr, int l, int r) {
//        return (this.arr,this.l,this.r);
//    }
//
//    @Override
//    public Object[] sortAsIntegersMQ(String[] arr, int l, int r) {
//        return new Object[0];
//    }
}
