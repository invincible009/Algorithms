package com.sdl.MapADT;

import org.apache.commons.lang.RandomStringUtils;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.UUID;

public class GenerateStringJava {
    public static void main(String[] args){
        System.out.println(generateString1(32));
        System.out.println("Generate using UUID: "+ generateStringFromUUID());
        System.out.println(Arrays.toString(squareNumbers(10)));
    }

    public static String generateString1(int num){
        return RandomStringUtils.randomAlphabetic(num);
    }

    public static String generateStringFromUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

    public static int[] squareNumbers(int num){
        int[] nums = new int[num];
        for (int i = 0; i < num; i++){
            int square = (i + 1)* (i + 1);
            nums[i] =square;
        }
        return nums;
    }


}
