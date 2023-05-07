package com.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testMergeSort() {

        int[] arr = {5,7,6,4,8,7,9,1,2};

        //sorted 2,4,5,6,7,7,8,9
        int[] expected = {1,2,4,5,6,7,7,8,9};

        MergeSort.sort(arr);

        assertArrayEquals(arr, expected);

    }

}
