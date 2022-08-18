package com.sdl.stringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateString {
    public static void printDuplicate(String word){
       //check for empty word and display empty
        if(word.equals("")){
            System.out.println("Empty word");
        }

        //Convert word to a char array
        char[] characters = word.toCharArray();

        //Create a Map and add the characters in it with their number of occurrence
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (Character ch: characters){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }else {
                charMap.put(ch, 1);
            }
        }

        //Iterate the map and print characters with more than 1 occurrence
        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry: entries){
            if(entry.getValue() > 1){
                System.out.println("Word : "+ entry.getKey() + " Value : "+ entry.getValue());
            }
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0){
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else {
                return true;
            }
        }
        return false;

    }






    public static void main(String[] args) {
      //printDuplicate("Programming");
        boolean ool = containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println(ool);
    }
}
