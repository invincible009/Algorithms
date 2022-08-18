package com.sdl.stringManipulation;

public class ReverseString {

    public static String reverseString(String word){

        //Check if the word is empty
        if(word.equals("")){//I am not using the address comparison, I am using the content comparison
            return "Empty Word";
        }

        //Convert the characters into an array
        char[] characters = word.toCharArray();

        //Get the start index and the end index of the characters in the array
        int startIndex = 0;
        int endIndex = characters.length - 1;

        //loop through the  character with the index
        //After time swap the characters at start and end index
        //Decrement the end and increment the start after every swap
        while (startIndex < endIndex){
            swapCharacter(characters, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

        //Return the new string

        return new String(characters);

    }

    private static void swapCharacter(char[] characters, int startIndex, int endIndex) {
        char item = characters[startIndex];
        characters[startIndex] = characters[endIndex];
        characters[endIndex] = item;
    }


    //Solution for leetcode version
    public void reverseString(char[] s) {
        //Check if the char array is empty


        //Get the start index of the array
        int startIndex = 0;

        //Get the end of the array
        int endIndex = s.length - 1;

        //loop inside the array of characters
        //Swap the characters based on start and index
        //For every swap increment start index and decrement endindex
        while(startIndex < endIndex){
            swap(s, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

    }

    public void swap(char[] characters, int startIndex, int endIndex){
        char item = characters[startIndex];
        characters[startIndex] = characters[endIndex];
        characters[endIndex] = item;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("I love You"));
    }
}
