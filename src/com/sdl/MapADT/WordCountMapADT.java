package com.sdl.MapADT;

import java.util.HashMap;
import java.util.Scanner;

public class WordCountMapADT {
    public static void main(String[] args) {
        HashMap<String, Integer> frequency = new HashMap<>();

        Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
        while (doc.hasNext()){
            String word = doc.next().toLowerCase();
            Integer count = frequency.get(word);
            if(count == null){
                count = 0;
                frequency.put(word, 1+ count);
            }
        }

        int value_maxCount = 0;
        String key_maxWord = "no word";

        for(java.util.Map.Entry<String, Integer> entry : frequency.entrySet()){
            if(entry.getValue() > value_maxCount){
                key_maxWord = entry.getKey();
                value_maxCount = entry.getValue();
            }
        }
        System.out.println("The most frequent word is "+ value_maxCount + " with " + key_maxWord + " occurrences");


    }
}
