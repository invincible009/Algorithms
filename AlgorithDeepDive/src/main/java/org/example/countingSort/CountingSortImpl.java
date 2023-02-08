package org.example.countingSort;

public class CountingSortImpl {
    public static void main(String[] args) {
//        int[] intArray ={20, 23,55,54,12,34,67,89,98,76,90,10,2,8,5,6,3};
        int[] intArray ={2, 5,9,8,2,8,7,10,4,3};
        //countingSort(intArray, 1, 10);
        countingSortWithoutArrMinMax(intArray, intArray.length);
        for(int num : intArray){
            System.out.print(num+ ", ");
        }
    }

    public static void countingSort(int[] inputArr, int min, int max){
        //Create a count array
        int[] countArray = new int[(max - min) + 1];
        //implement the counting phase
        for(int index = 0; index < inputArr.length; index++){
            countArray[inputArr[index] -min]++;
        }

        //write back to the input array from the count array
        int indexUseToWriteToInputArray = 0;
        for(int indexUsedToTraverseArr = min; indexUsedToTraverseArr <= max; indexUsedToTraverseArr++){
            //write back to the main array
            while (countArray[indexUsedToTraverseArr - min] > 0){
                inputArr[indexUseToWriteToInputArray++]= indexUsedToTraverseArr;
                countArray[indexUsedToTraverseArr - min]--;
            }
        }
    }

    //if you are given the array without a min and max index but the size of the array
    public static void countingSortWithoutArrMinMax(int[] array, int size){

        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }
}
