package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray ={20, 23,55,-54,12,-34,67,89,98,76,90,10,2,8,-5,6,-3};
       Arrays.parallelSort(intArray);
        for(int num : intArray){
            System.out.print(num+ ", ");
        }
    }
}