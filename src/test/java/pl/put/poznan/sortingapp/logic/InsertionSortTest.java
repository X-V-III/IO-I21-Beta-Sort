package pl.put.poznan.sortingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InsertionSortTest {

    private InsertionSort a;
    private final String[] original = {"5", "1", "4", "2", "8"};

    @BeforeEach
    void setup(){
        InputList inputList = new InputList(original);
        a = new InsertionSort(inputList);
    }

    @Test
    void sortAsIntegers() {
        String[] sorted = {"1","2","4","5","8"};
        assertEquals(Arrays.toString(sorted), Arrays.toString(a.sortAsIntegers()));
    }

    @Test
    void sortAsStrings() {
        String[] original = {"tata","waz", "ala"};
        InputList inputList = new InputList(original);
        a = new InsertionSort(inputList);
        String[] sorted = {"ala","tata","waz"};
        assertEquals(Arrays.toString(sorted), Arrays.toString(a.sortAsStrings()));
    }

    @Test
    public void insertionSortMockInt() throws Exception {
        InputList mockObject = mock(InputList.class);
        String[] sorted = {"1","2","4","5","8"};
        when(mockObject.getArr()).thenReturn(new String[]{"5", "1", "4", "2", "8"});
        InsertionSort testedObject = new InsertionSort(mockObject);
        String[] result = testedObject.sortAsIntegers();
        verify(mockObject).getArr();
        Assertions.assertEquals(Arrays.toString(sorted), Arrays.toString(result));
    }

    @Test
    public void insertionSortMockStr() throws Exception {
        InputList mockObject = mock(InputList.class);
        String[] sorted = {"ala", "mama", "tata"};
        when(mockObject.getArr()).thenReturn(new String[]{"tata", "mama", "ala"});
        InsertionSort testedObject = new InsertionSort(mockObject);
        String[] result = testedObject.sortAsStrings();
        verify(mockObject).getArr();
        Assertions.assertEquals(Arrays.toString(sorted), Arrays.toString(result));
    }

}