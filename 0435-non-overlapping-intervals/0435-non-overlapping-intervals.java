class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort by ending time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1]; // Keep this interval
            } else {
                count++; // Remove overlapping interval
            }
        }

        return count;
    }
}