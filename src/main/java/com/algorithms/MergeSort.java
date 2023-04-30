package com.algorithms;

public class MergeSort {
    
    public static void mergeSort(int[] arr, int low, int high) {

        if(low >= high) {
            return;
        }

        int middle = (low + high)/2;

        mergeSort(arr, low, middle);
        mergeSort(arr, middle+1, high);

        merge(arr,low,middle,high);
        

    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high-low+1];

        int i=low;

        int j=mid +1;
        int index=0;

        while(i<=mid && j<=high) {

            if(arr[i]<=arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }

        while(i<=mid) {
            temp[index++] = arr[i++];
        }

        while(j<=high) {
            temp[index++] = arr[j++];
        }

        index=0;
        i=low;
        while(i<=high) {
            arr[i++]=temp[index++];
        }

    }

    public static void sort(int[] arr) {

        mergeSort(arr, 0, arr.length-1);
    }

}
