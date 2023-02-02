package com.sdl.datastructure;

import java.util.Arrays;

public class MergeSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = new int[]{20,35,-15,7,55,1,-22};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int[] arr, int start , int end){
        //set a break point
        if(end - start < 2){
            return;
        }
        
        int mid = (start + end)/2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        if(arr[mid -1] <= arr[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int [] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = arr[i] <= arr[j ] ? arr[i++]:arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid-i);
        System.arraycopy(arr, 0, arr, start , tempIndex);
    }
}

