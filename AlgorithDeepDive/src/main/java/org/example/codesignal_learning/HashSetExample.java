package org.example.codesignal_learning;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
//        set.add("Gabriel");
//        set.add("Gabriel");
//        set.add("John");
//        set.add("Elizabeth");
//        set.add("Elizabeth");
//        set.add("Matthew");

        String[] names = {"cat", "dog", "elephant", "goat", "monkey", "goat", "cat", "goat"};
        System.out.println(uniqueWord(names));


//        System.out.println(set);
//        System.out.println(set.size());
//
//        Set<Integer> intSet = new HashSet<>();
//
//        //For adding and removing elements from a hashcode
//        for(int i = 0; i < 100; i++){
//            intSet.add(i);
//        }
//
//        for(int i = 0; i < 100; i++){
//            if(intSet.contains(i)){
//                System.out.println(i + " Found ");
//            }
//        }
    }

    //I want to write a public static method that can get the unique word from a list
    public static String uniqueWord(String[] words){
        HashSet<String> wordSet = new HashSet<>();
        HashSet<String> duplicateWords = new HashSet<>();

        for(String word : words){
            if(wordSet.contains(word)){
                duplicateWords.add(word);
            }else {
                wordSet.add(word);
            }
        }

        wordSet.removeAll(duplicateWords);

        String uniqueWord ="";

        for(int i = words.length -1 ; i >=0; i--){
            if(wordSet.contains(words[i])){
                uniqueWord = words[i];
                break;
            }
        }

        return uniqueWord;
    }
}
