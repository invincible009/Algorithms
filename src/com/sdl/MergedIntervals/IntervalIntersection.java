package com.sdl.MergedIntervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {

    public  Intervals[] merge(Intervals[] arry1, Intervals[] arry2){

        //Step 1
        List<Intervals> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arry1.length && j < arry2.length){

            //Step 4
//            if((arry1[i].start >= arry2[j].start && arry1[i].start <= arry2[j].end)||
//                    (arry2[j].start >= arry1[i].start && arry2[j].start <= arry1[i].end )){
//                result.add(new Intervals(Math.max(arry1[i].start, arry2[j].start), Math.min(arry1[i].end, arry2[j].end)));
//            }

            //Or step 4
            int low = Math.max(arry1[i].start, arry2[j].start);
            int high = Math.min(arry1[i].end, arry2[j].end);

            if(low <= high){
                result.add(new Intervals(low, high));
            }



            //Step 3
            if(arry1[i].end < arry2[j].end){
                i++;
            }else {
                j++;
            }
        }


        //Step 2
        return result.toArray(new Intervals[result.size()]);
    }



    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
       //Step 1
        List<int[]> result = new ArrayList<>();

        //Step 3
        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length){

            int low = Math.max(firstList[i][0], secondList[j][0]);
            int high = Math.min(firstList[i][1], secondList[j][1]);

            if(low <= high){
                result.add(new int[]{low, high});
            }

            //Step 4
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else {
                j++;
            }
        }

        //Step 2
        return result.toArray(new int[result.size()][]);
    }


}
