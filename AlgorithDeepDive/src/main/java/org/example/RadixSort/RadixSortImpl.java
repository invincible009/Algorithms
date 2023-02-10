package org.example.RadixSort;

public class RadixSortImpl {
    public static void main(String[] args) {
        int[] intArray ={4725, 4586, 1330, 8792,1594,5729};
        radixSort(intArray, 10, 4);
        for(int num : intArray){
            System.out.print(num+ ", ");
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int numbOfItems = input.length;
        int[] countArray = new int[radix];

        for(int value: input){
            countArray[getDigits(position, value, radix)]++;
        }

        //Adjust the count array
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j -1];
        }

        //Copy the values into the temp array
        int[] temp = new int[numbOfItems];
        for(int tempIndex = numbOfItems -1;  tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigits(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        //Copying the values back into the main array
        for(int tempIndex = 0; tempIndex < numbOfItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigits(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

}
