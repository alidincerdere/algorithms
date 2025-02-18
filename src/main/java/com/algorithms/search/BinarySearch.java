package com.algorithms.search;

public class BinarySearch {
    
    public static int search(int[] arr, int key) {

        int low = 0;
        int high = arr.length-1;

        while (low<=high) {

            int mid = low + (high - low)/2;

            if(arr[mid]<key) {

                low = mid+1;
            } else if(arr[mid]>key) {
                high = mid-1;
            } else {
                return mid;
            }
            
        }

        return -1;

    }

    //rotated sorted list
    public static int search(int[] arr, int key, int offset) {

        int low = offset;
        int high = arr.length + offset -1;

        while (low<=high) {

            int mid = low + (high - low)/2;

            if(arr[mid%arr.length]<key) {

                low = mid+1;
            } else if(arr[mid%arr.length]>key) {
                high = mid-1;
            } else {
                return mid%arr.length;
            }
            
        }

        return -1;

    }
 
    public static int findOffsetRoated(int[] arr) {

        int low = 0;
        int high = arr.length-1;

        while(low<high) {
            if(arr[low]<arr[high]) {
                //already sorted
                return low;
            }

            int mid = low + (high - low)/2;

            if(arr[mid]>arr[high]) {

                low = mid+1;
             
            } else  {
                high = mid;
            } 
        }

        return low;

    }
        
}
