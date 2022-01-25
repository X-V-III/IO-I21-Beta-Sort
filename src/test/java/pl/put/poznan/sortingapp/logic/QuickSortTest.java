package pl.put.poznan.sortingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

class QuickSortTest {

    private QuickSort q;
    private final String[] original = {"5", "1", "4", "2", "8"};

    @BeforeEach
    void setup(){
        InputList inputList = new InputList(original);
        q = new QuickSort(inputList);
    }

    @Test
    void sortAsStrings() {
        String[] original = {"tata","mama", "ala"};
        InputList inputList = new InputList(original);
        q = new QuickSort(inputList);
        String[] sorted = {"ala","mama","tata"};
        assertEquals(Arrays.toString(sorted), Arrays.toString(q.sortAsStrings()));
    }

    @Test
    public void quickSortMockString() throws Exception {
        InputList mockObject = mock(InputList.class);
        String[] sorted = {"ala", "mama", "tata"};
        when(mockObject.getArr()).thenReturn(new String[]{"tata", "mama", "ala"});
        QuickSort testedObject = new QuickSort(mockObject);
        String[] result = testedObject.sortAsStrings();
        verify(mockObject).getArr();
        Assertions.assertEquals(Arrays.toString(sorted), Arrays.toString(result));
    }

}