package pl.put.poznan.sortingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort m;
    private final String[] original = {"5", "1", "4", "2", "8"};

    @BeforeEach
    void setup(){
        InputList inputList = new InputList(original);
        m = new MergeSort(inputList);
    }

    @Test
    void sortAsIntegers() {
        String[] sorted = {"1","2","4","5","8"};
        assertEquals(Arrays.toString(sorted), Arrays.toString(m.sortAsIntegers()));
    }

    @Test
    void sortAsStrings() {
        String[] original = {"tata","mama", "ala"};
        InputList inputList = new InputList(original);
        m = new MergeSort(inputList);
        String[] sorted = {"ala","mama","tata"};
        assertEquals(Arrays.toString(sorted), Arrays.toString(m.sortAsStrings()));
    }


}