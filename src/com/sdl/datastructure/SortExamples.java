package com.sdl.datastructure;

import java.util.Arrays;

/**
 * In this example I am going to implement a bubblesort example
 */
public class SortExamples extends Utils {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22, -32,8};

        /**
         * In this implementation, I'll be sorting the array from right to left.
         *The array will be sorted in accenting order.
         */
        bobbleSortImplementation(intArray);
        selectionSortImplementation(intArray);
        insertionSortImplementation(intArray);
        insertionSortUsingShellSort(intArray);


    }

    /**
     * This bobble sort example bobbles the largest number to the end of the array
     * by maintaining  an unsorted index, looping through the values before that index,
     * comparing them with the values next to them, and performing a swap if need be.
     * @param arr
     */
    public static void bobbleSortImplementation(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int index = 0; index < lastUnsortedIndex; index++) {
                if (arr[index] > arr[index + 1]) {
                    swap(arr, index, index + 1);
                }
            }
        }
        System.out.println(" Bobble sort result "+Arrays.toString(arr));
    }


    /**
     * This implementation of selectionsort algo selects a value as the largest and uses it
     * by comp earning it with other values as we traverse the array. An unsorted index is held and
     * compared with the largest index before a swap is carried out on the array.
     * @param arr
     */
    public static void selectionSortImplementation(int[] arr){
        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            int largest = 0;
            for(int index = 1; index <= lastUnsortedIndex; index++){
                if(arr[index] > arr[largest]){
                    largest = index;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }

        System.out.println(" Selection sort result "+Arrays.toString(arr));
    }


    /**
     * The insertion sort algorithm uses the index of the first item in the array as a position to sort the algorithm
     * all the unsorted items will be put into index 0 while traversing through the algorithm.
     * This is stable algorithm because all the elements are sorted from left to right which will preserve the actual position
     * of the array.
     * It also runs in O(n^2) time complexity.
     * @param arr
     */
    public static void insertionSortImplementation(int[] arr){

        //Edge case must be caught
        if(arr.length == 0)
            return;

        for (int firstUnsortedIndex = 0; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];

            int index;

            for (index = firstUnsortedIndex; index > 0 && arr[index- 1] > newElement; index--){
                arr[index] = arr[index -1];
            }

            arr[index] = newElement;
        }
         System.out.println(" Insertion sort result "+Arrays.toString(arr));
    }

    public static void insertionSortUsingShellSort(int[] arr){
        //Edge cases must be caught
        if(arr.length  == 0)
            return;

        for(int gap = arr.length/2; gap > 0; gap /=2){
            int newElement = arr[gap];

            int gapIndex = gap;
            while (gapIndex >= gap && arr[gapIndex - gap] > newElement){
                arr[gapIndex] = arr[gapIndex - gap];
                gapIndex -= gap;
            }
            arr[gapIndex] = newElement;
        }

        System.out.println(" Insertion sort using Gap result "+Arrays.toString(arr));
    }


}
