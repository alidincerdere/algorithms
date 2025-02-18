package com.algorithms.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchTest {

    int[] sortedArray = {0,1,2,8,9,15,24};

    int[] rotatedArray = {8,9,15,24,0,1,2,8,8,8,8,8,8,8,8,8};
    int[] rotatedArray2 = {8,8,8,8,8,8,8,8,9,15,24,0,1,2,8,8,8,8,8,8,8,8,8};

    @Test
    void testBinarySearch() {

        assertEquals(4,BinarySearch.search(sortedArray, 9) );
        assertEquals(1,BinarySearch.search(rotatedArray, 9, 4) );
        assertEquals(-1,BinarySearch.search(sortedArray, 100) );
        assertEquals(-1,BinarySearch.search(rotatedArray, 100, 4) );

        //assertEquals(11, BinarySearch.findOffsetRoated(rotatedArray2));
    }
}
