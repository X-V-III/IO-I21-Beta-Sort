package pl.put.poznan.sortingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    private HeapSort h;
    private final String[] original = {"5", "1", "4", "2", "8"};

    @BeforeEach
    void setup(){
        InputList inputList = new InputList(original);
        h = new HeapSort(inputList);
    }

    @Test
    void sortAsIntegers() {
        String[] original = {"5","1", "4", "2", "8"};
        String[] sorted = {"1","2","4","5","8"};
        Assertions.assertArrayEquals(sorted, h.sortAsIntegers());
    }

    @Test
    void sortAsStrings() {
        String[] original = {"tata","mama", "ala"};
        String[] sorted = {"ala","mama","tata"};
        Assertions.assertArrayEquals(sorted, h.sortAsStrings());
    }

}