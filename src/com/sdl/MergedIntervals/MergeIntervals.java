package com.sdl.MergedIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    /*
    Given a list of non-overlapping intervals sorted by their start time,
    insert a given interval at the correct position and merge all necessary
    intervals to produce a list that has only mutually exclusive intervals.
     */
    public List<Intervals> mergedIntervals(List<Intervals> intervalsList, Intervals newInterval) {
        if (intervalsList.isEmpty() || intervalsList.size() == 0) {
            return Arrays.asList(newInterval);
        }

        int index = 0;
        List<Intervals> mergedList = new ArrayList<>();

        while (index < intervalsList.size() && intervalsList.get(index).end < newInterval.start) {
            mergedList.add(intervalsList.get(index++));
        }

        while (index < intervalsList.size() && intervalsList.get(index).start <= newInterval.end) {
            newInterval.start = Math.min(intervalsList.get(index).start, newInterval.start);
            newInterval.end = Math.max(intervalsList.get(index).end, newInterval.end);
        }

        mergedList.add(newInterval);

        while (index < intervalsList.size()) {
            mergedList.add(intervalsList.get(index++));
        }

        return mergedList;
    }

    public int[][] mergedIntervals(int [][] intervals){
        Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]));

        LinkedList<int[]> mergedList = new LinkedList<>();
        for(int[] interval : intervals){
            if(mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]){
                mergedList.add(interval);
            }else {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1] );
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
