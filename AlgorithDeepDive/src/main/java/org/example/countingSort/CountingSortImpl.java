package org.example.countingSort;

public class CountingSortImpl {
    public static void main(String[] args) {
//        int[] intArray ={20, 23,55,54,12,34,67,89,98,76,90,10,2,8,5,6,3};
        int[] intArray ={2, 5,9,8,2,8,7,10,4,3};
        countingSort(intArray, 1, 10);
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
}
