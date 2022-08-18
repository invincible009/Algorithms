package com.sdl.stringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        return Arrays.equals(firstWord, secondWord);

    }

    public boolean uniqueOccurrences(int[] arr) {

        //base case
        if(arr.length == 0){
            return false;
        }

        //create a map to store the values
        HashMap<Integer, Integer> numMap = new HashMap<>();

        //loop through the numbers and update their values in the map
        for(Integer num: arr){
            if(numMap.containsKey(num)){
                numMap.put(num, numMap.get(num) + 1);
            }else{
                numMap.put(num, 1);
            }
        }


        //loop and Compare the map values
        for(Map.Entry<Integer, Integer> entry: numMap.entrySet()){
            if(entry.getValue().equals(entry.getKey() +1)){
                return true;
            }
        }
        return false;

    }
}
