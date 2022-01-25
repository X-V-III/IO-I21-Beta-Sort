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
        Assertions.assertArrayEquals(sorted, b.sortAsIntegers());
    }

    @Test
    void sortAsStrings() {
        String[] original = {"tata","mama", "ala"};
        String[] sorted = {"ala","mama","tata"};
        Assertions.assertArrayEquals(sorted, b.sortAsStrings(original));
    }

    @Test
    public void bubbleSortMockInt() throws Exception {
        InputList mockObject = mock(InputList.class);
        String[] sorted = {"1","2","4","5","8"};
        when(mockObject.getArr()).thenReturn(new String[]{"5", "1", "4", "2", "8"});
        BubbleSort testedObject = new BubbleSort(mockObject);
        String[] result = testedObject.sortAsIntegers();
        verify(mockObject).getArr();
        Assertions.assertEquals(Arrays.toString(sorted), Arrays.toString(result));

    }
}