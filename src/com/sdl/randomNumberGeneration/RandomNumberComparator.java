package com.sdl.randomNumberGeneration;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberComparator {
    public static void main(String[] args) {
        int data[] = new int[10];
        //Create a random generator
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());  //Random number seed.

        //loop through the random numbers and add the generated number
        for(int index = 0; index < data.length; index++){
            data[index] = rand.nextInt(100);
        }

        int originalData[] = Arrays.copyOf(data, data.length);
        System.out.println("Original = "+Arrays.toString(originalData));

       int[] range =  Arrays.copyOfRange(originalData, 4,data.length); //Take from this guy and print all the numbers ahead ontill you reach that guy
        System.out.println("Range = "+Arrays.toString(range));
        System.out.println("Arrays before it was sorted = "+ Arrays.equals(data, originalData));

        Arrays.sort(originalData);
        Arrays.fill(originalData, 4);
        int value = Arrays.binarySearch(originalData, 4);

        System.out.println("The value of the index is = "+ value);
        System.out.println("Arrays after it has been sorted = "+ Arrays.equals(data, originalData));

        System.out.println("Data = "+Arrays.toString(data));
        System.out.println("Original = "+Arrays.toString(originalData));
    }
}
