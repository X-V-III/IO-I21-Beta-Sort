package pl.put.poznan.sortingapp.logic;

public interface SortingAlgorithm {
     default void sort(String[] arr, String sortAs) {}
     default Object[] sortAsIntegers(String[] arr) {return arr;}
    default Object[] sortAsStrings(String[] arr) {return arr;}
;
}
