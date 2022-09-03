package com.sdl.MapADT;

import org.apache.commons.lang.RandomStringUtils;

import java.security.SecureRandom;
import java.util.UUID;

public class GenerateStringJava {
    public static void main(String[] args){
        System.out.println(generateString1(32));
        System.out.println("Generate using UUID: "+ generateStringFromUUID());
    }

    public static String generateString1(int num){
        return RandomStringUtils.randomAlphabetic(num);
    }

    public static String generateStringFromUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }


}
