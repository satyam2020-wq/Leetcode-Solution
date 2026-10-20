class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            // Merge overlapping intervals
            if (!list.isEmpty() &&
                interval[0] <= list.get(list.size() - 1)[1]) {

                int[] last = list.get(list.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            } else {
                list.add(interval);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}