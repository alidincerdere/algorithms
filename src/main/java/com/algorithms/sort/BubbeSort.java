package com.algorithms.sort;

public class BubbeSort {

    public static void bubleSort(int arr[]) {

        int len = arr.length;

        for(int i=0; i<len; i++) {
            boolean swapped = false;
            for(int j=0; j<len-1-i; j++) {

                if(arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                    swapped = true;
                }
                

            }
            if(!swapped) {
                break;
            }
        }

    }
    
}
