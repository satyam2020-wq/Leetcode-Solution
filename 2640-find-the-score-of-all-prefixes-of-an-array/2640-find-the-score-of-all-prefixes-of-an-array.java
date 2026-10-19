// Core Idea: Maintain the prefix maximum and cumulative score.
// Approach: For each element, add nums[i] + max to the previous score
// and store the cumulative score in the result array.

class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        int max = 0;
        long score = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]); // Update prefix maximum

            score += nums[i] + max; // Update cumulative score
            ans[i] = score; // Store prefix score
        }

        return ans;
    }
}