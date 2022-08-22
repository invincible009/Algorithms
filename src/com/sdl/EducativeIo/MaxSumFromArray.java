package com.sdl.EducativeIo;

import java.util.List;

public class MaxSumFromArray {

    /*
    Given an array of positive numbers, determine the contiguous subArray with the max sum given a key
     */

    public int maxsumOfSubarray(int[] numbers, int key) {
        int maxsum = 0;
        int windowSum;

        for (int i = 0; i <= numbers.length -key; i++){
            windowSum = 0;

            for(int j = i; j < i + key; j++){
                windowSum += numbers[j];
            }

            maxsum = Math.max(maxsum, windowSum);
        }
        return maxsum;
    }

    public int maxsumOfSubarray2(int[] numbers, int key) {
        int maxsum = 0;
        int windowSum = 0;
        int windowStart = 0;

         for(int windowEnd = 0; windowEnd < numbers.length; windowEnd++){
             windowSum += numbers[windowEnd];
             if(windowEnd >= key -1){
                 maxsum = Math.max(windowSum, maxsum);
                 windowSum -= numbers[windowStart];
                 windowStart++;
             }
         }
        return maxsum;
    }

    public List<Integer> IndexOfMaxSumOfSubarray(int[] numbers, int key) {


        return null;
    }

    /*
    Given the same array find return the index of the contiguous subarray
     */
}
