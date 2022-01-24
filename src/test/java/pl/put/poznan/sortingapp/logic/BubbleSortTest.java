package pl.put.poznan.sortingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class BubbleSortTest {

    private BubbleSort b;
    private final String[] original = {"5", "1", "4", "2", "8"};

    @BeforeEach
    void setup(){
        InputList inputList = new InputList(original);
        b = new BubbleSort(inputList);
    }

    @Test
    void sortAsIntegers() {

        String[] sorted = {"1","2","4","5","8"};
        Assertions.assertArrayEquals(sorted, b.sortAsIntegers(original));
    }

    @Test
    void sortAsStrings() {
        String[] original = {"tata","mama", "ala"};
        String[] sorted = {"ala","mama","tata"};
        Assertions.assertArrayEquals(sorted, b.sortAsStrings(original));
    }

    @Test
    public void bubbleSortMockInt() throws Exception {
        SortingAlgorithm mockObject = mock(SortingAlgorithm.class);
        String[] original = {"5","1", "4", "2", "8"};
        String[] sorted = {"1","2","4","5","8"};
        when(mockObject.sortAsIntegers(original)).thenReturn(original);
        BubbleSort testedObject = new BubbleSort(mockObject);
        Object[] result = testedObject.sortAsIntegers(original);
        verify(mockObject).sortAsIntegers(original);
        Assertions.assertEquals( sorted, result);

    }
}