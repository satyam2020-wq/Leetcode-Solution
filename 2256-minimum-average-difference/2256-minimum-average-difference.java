class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long totalSum = 0;

        for (int num : nums) { // sum of all elements
            totalSum += num;
        }

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;
        int ans = 0;

        // Check each index as a possible split
        for (int i = 0; i < n; i++) {
            leftSum += nums[i];

            long leftAvg = leftSum / (i + 1);
            long rightAvg = 0;  // Right part must be non-empty

            if (i < n - 1) {
                rightAvg = (totalSum - leftSum) / (n - i - 1);
            }

            // Last index has right average = 0
            long diff = Math.abs(leftAvg - rightAvg);

            // Update minimum difference and its index
            if (diff < minDiff) {
                minDiff = diff;
                ans = i;
            }
        }

        return ans;
    }
}