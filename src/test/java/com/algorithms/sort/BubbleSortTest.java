package com.algorithms.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    
    @Test
    void testBubleSort() {

        int arr[] = {8,12,3,9,6,8,1};

        int expected[] = {1,3,6,8,8,9,12}; 

        BubbeSort.bubleSort(arr);

        assertArrayEquals(expected,arr);

    }
}
