package com.sdl.datastructure;

public class Utils {

    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int factorial(int num){
        if(num < 0)
            throw new IllegalArgumentException(num + " is less than 0 ");
        if(num == 0)
            return 1;
        return num * factorial(num-1);
    }
}
