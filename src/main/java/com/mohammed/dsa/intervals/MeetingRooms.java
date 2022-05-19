package com.mohammed.dsa.intervals;

import java.util.Comparator;
import java.util.List;

public class MeetingRooms {

    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        intervals.sort(Comparator.comparing(Interval::getStart));

        for (int i = 0; i < intervals.size(); i++) {
            Interval i1 = intervals.get(i - 1);
            Interval i2 = intervals.get(i);

            if (i1.end > i2.start) {
                return false;
            }
        }
        return true;
    }

    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        int getStart() {
            return this.start;
        }
    }
}
