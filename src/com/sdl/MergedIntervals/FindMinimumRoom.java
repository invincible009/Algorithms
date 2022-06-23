package com.sdl.MergedIntervals;

import java.util.*;

public class FindMinimumRoom {

    public static int findMinimumMeetingRoom(List<Meeting> meetingRooms){
        if(meetingRooms == null || meetingRooms.size() == 0){
            return 0;
        }

      Collections.sort(meetingRooms, (a,b)-> Integer.compare(a.start, b.start));
        int minRooms = 0;
        PriorityQueue<Meeting> minHeap = new PriorityQueue<>(meetingRooms.size(), (a,b)-> Integer.compare(a.end, b.end));

        for( Meeting meeting: meetingRooms){
            while (!minHeap.isEmpty() && meeting.start >= minHeap.peek().end){
                minHeap.poll();
            }

            minHeap.offer(meeting);

            minRooms = Math.max(minRooms, minHeap.size());
        }
       return minRooms;
    }


    public boolean canAttendMeeting(Intervals[] intervals){
        if(intervals.length ==0){
            return false;
        }
        Arrays.sort(intervals, (a, b)-> Integer.compare(a.start, b.start));

        Intervals last = null;

        for(Intervals interval : intervals){
            if(last != null && interval.start >= interval.end){
                return false;
            }
            last = interval;
        }
        return true;
    }

    private static boolean[] solve(int[][] calendar, int rooms, int[][] queries) {
        boolean[] res = new boolean[queries.length];
        List<int[]> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(calendar));
        for(int i=0;i<res.length;i++) {
            lst.add(queries[i]);
            if(getRooms(lst) <= rooms)
                res[i] = true;
            lst.remove(lst.size() - 1);
        }
        return res;
    }

    static int getRooms(List<int[]> calendar){
        int[] starts = new int[calendar.size()];
        int[] ends = new int[calendar.size()];
        for(int i=0;i<calendar.size();i++) {
            starts[i] = calendar.get(i)[0];
            ends[i] = calendar.get(i)[1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int res = 0, endIdx = 0;
        for(int i=0;i<starts.length;i++) {
            if(starts[i] < ends[endIdx])
                res++;
            else
                endIdx++;
        }
        return res;
    }

}
