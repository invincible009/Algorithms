package org.example.quickSort;

public class QuickSortImpl {
    public static void main(String[] args) {
        int[] intArray ={20, 23,55,-54,12,-34,67,89,98,76,90,10,2,8,-5,6,-3};
        quickSort(intArray, 0, intArray.length);
        for(int num : intArray){
            System.out.print(num+ ", ");
        }
    }

    public static void quickSort(int[] intArray, int start, int end){
        if(end - start < 2){
            return;
        }

        int pivotIndex = partitionArray(intArray, start, end);
        quickSort(intArray, start, pivotIndex);
        quickSort(intArray, pivotIndex + 1, end);
    }

    private static int partitionArray(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int i = start;
        int j = end;

        while (i < j){

            while (i < j && intArray[--j] >= pivot);
            if(i < j){
                intArray[i] = intArray[j];
            }


            while (i < j && intArray[++i] <= pivot);
            if(i < j){
                intArray[j] = intArray[i];
            }
        }
        intArray[j] = pivot;
        return j;
    }
}
