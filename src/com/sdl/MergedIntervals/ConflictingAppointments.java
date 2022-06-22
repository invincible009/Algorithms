package com.sdl.MergedIntervals;

import java.util.Arrays;

public class ConflictingAppointments {
    public static boolean canAttendAppointment(Intervals [] intervals){
        //First thing is to sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        //Loop inside the intervals and check if there's an overlap
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i].start < intervals[i -1].end){
                return false;
            }
        }
        return true;
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        //Sort by the end
        Arrays.sort(intervals, (a, b)-> Integer.compare(a[1],b[1]));

        int counter = 0;

        for(int i = 1; i < intervals.length; i++ ){
            if(intervals[i][0] < intervals[i - 1][1]){
                counter++;
            }
        }
        return counter;

    }


}
