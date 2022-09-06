package com.sdl.datastructure;

import java.util.Arrays;

/**
 * In this example I am going to implement a bubblesort example
 */
public class SortExamples extends Utils {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        /**
         * In this implementation, I'll be sorting the array from right to left.
         *The array will be sorted in accenting order.
         */
        bobbleSortImplementation(intArray);
        selectionSortImplementation(intArray);
        insertionSortImplementation(intArray);


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

    public static void insertionSortImplementation(int[] arr){

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];

            int index;

            for(index = firstUnsortedIndex; index > 0 && arr[index - 1] > newElement; index--){
                arr[index] = arr[index - 1];
            }

            arr[index] = newElement;
        }
        System.out.println(" Insertion sort result "+Arrays.toString(arr));
    }


}
