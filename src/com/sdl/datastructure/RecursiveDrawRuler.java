package com.sdl.datastructure;

public class RecursiveDrawRuler {
    public static void main(String[] args) {
//        drawRuler(2, 4);
        int[] intArray ={2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(binarySearch(intArray, 8, 0,11));
    }


    /**
     * Draws a line with the given tick length(but no label
     * @param tickLength
     */
    private static void drawLine(int tickLength){
        drawLine(tickLength,-1);
    }

    private static void drawLine(int tickLength, int tickLabel){
        for (int i = 0; i < tickLength; i++){
            System.out.println("-");

            if(tickLabel >= 0)
                System.out.println(" "+ tickLabel);

            System.out.println();
        }
    }


    /**
     * This method dose nothing if the argument is <1 else it recursively
     * drwas the top interval, draws the center tick line and recursively draw the bottom interval
     * @param centralLength
     */
    private static void drawInterval(int centralLength){
        if(centralLength >=1){
            drawInterval(centralLength -1);
            drawLine(centralLength);
            drawInterval(centralLength -1);
        }
    }

    /**
     * draw an english ruler for the given number of inches and major tick length
     * @param nInches
     * @param majorLength
     */
    public static void drawRuler(int nInches, int majorLength){
        drawLine(majorLength, 0);
        for (int i = 1; i < nInches; i++){
            drawInterval(majorLength-1);
            drawLine(majorLength, i);
        }
    }

    /**
     * Can I actually implement a bianry search without including the third arguments
     */

    private static int binarySearch(int[] input , int target, int start, int end){
        if(input.length < 0)
            throw new IllegalArgumentException(input.length + " is an invalid input");
        if(input.length == 0)
            return 1;

        int mid = (end + start)/2;

        if(mid == target)
            return target;

        if (target < mid){
            return binarySearch(input, target, start, mid-1);
        }else {
            return binarySearch(input, target, end, mid + 1);
        }
    }
}
