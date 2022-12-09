package com.sdl;

public class Main {

    public static void main(String[] args) {
        String name  = "Mbaiorga";
        printReverse(name);
    }

    private static void printReverse(String name) {
        char[] charList= name.toCharArray();
        helper(0,charList);
    }

    private static void helper(int i, char[] charList) {
        if(charList == null || i >= charList.length)
            return;

        helper(i+1, charList);
        System.out.print(charList[i]);
    }
}
