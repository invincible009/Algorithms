package com.sdl.datastructure;

public class MergeSortExample {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    }

    public static void mergeSort(int[] array, int start, int end){
        //When to break out of the recursion
        if(end - start < 2)
            return;

        int mid = (start + end)/2;
        mergeSort(array, start,mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        if(array[mid -1] <= array[mid])
            return;
    }
}
