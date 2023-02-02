package org.example;

public class MergeSortImpl {
    public static void main(String[] args) {
        int[] intArray ={20, 23,55,-54,12,-34,67,89,98,76,90,10,2,8,-5,6,-3};
        mergeSort(intArray, 0, intArray.length);
        for(int num : intArray){
            System.out.print(num+ ", ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(end - start < 2)
            return;

        int midPoint = getMidPoint(start, end);
        mergeSort(arr, start, midPoint);
        mergeSort(arr, midPoint, end);
        mergeSortArray(arr, start, midPoint, end);
    }

    private static void mergeSortArray(int[] arr, int start, int midPoint, int end) {
        if(arr[midPoint - 1] < arr[midPoint])
            return;

        int i = start;
        int j = midPoint;
        int tempIndex = 0;
        int tempArray[] = new int[start + end];
        while (i < midPoint && j < end){
            tempArray[tempIndex++] = arr[i] <= arr[j] ? arr[i++]:arr[j++];
        }
        copyArrays(arr, start, midPoint, end, i, tempIndex, tempArray);
    }

    private static void copyArrays(int[] arr, int start, int midPoint, int end, int i, int tempIndex, int[] tempArray) {
        System.arraycopy(arr, i, arr, start + tempIndex, midPoint - i);
        System.arraycopy(tempArray, 0, arr, start, tempIndex);
    }

    private static int getMidPoint(int start, int end) {
        return (start + end) /2;
    }
}
