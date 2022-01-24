//package pl.put.poznan.sortingapp.logic;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class QuickSortTest {
//
//    private QuickSort q;
//    private final String[] original = {"5", "1", "4", "2", "8"};
//
//    @BeforeEach
//    void setup(){
//        InputList inputList = new InputList(original);
//        q = new QuickSort(inputList);
//    }
//
////    @Test
////    void sortAsIntegers() {
////        String[] original = {"5","1", "4", "2", "8"};
////        String[] sorted = {"1","2","4","5","8"};
////        Assertions.assertArrayEquals(sorted, QuickSort.sortAsIntegers(original, 0 ,original.length - 1));
////    }
//
//    @Test
//    void sortAsStrings() {
//        String[] original = {"tata","mama", "ala"};
//        String[] sorted = {"ala","mama","tata"};
//        Assertions.assertArrayEquals(sorted, QuickSort.sortAsStrings(original, 0 ,original.length - 1));
//    }
//
//}