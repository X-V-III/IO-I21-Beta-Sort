package pl.put.poznan.sortingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class BubbleSortTest {

    private BubbleSort bStrings;
    private BubbleSort bInts;
    private final String[] originalInts = {"5", "1", "4", "2", "8"};
    private final String[] originalStrings = {"tata","mama", "ala"};

    @BeforeEach
    void setup(){
        bInts = new BubbleSort(new InputList(originalInts));
        bStrings = new BubbleSort(new InputList(originalStrings));
    }

    @Test
    void sortAsIntegers() {

        String[] sorted = {"1","2","4","5","8"};
        Assertions.assertArrayEquals(sorted, bInts.sortAsIntegers());
    }

    @Test
    void sortAsStrings() {

        String[] sorted = {"ala","mama","tata"};
        Assertions.assertArrayEquals(sorted, bStrings.sortAsStrings());
    }

    @Test
    public void bubbleSortMockInt() {
        InputList mockObject = mock(InputList.class);
        String[] sorted = {"1","2","4","5","8"};
        when(mockObject.getArr()).thenReturn(new String[]{"5", "1", "4", "2", "8"});
        BubbleSort testedObject = new BubbleSort(mockObject);
        String[] result = testedObject.sortAsIntegers();
        verify(mockObject).getArr();
        Assertions.assertEquals(Arrays.toString(sorted), Arrays.toString(result));

    }
}