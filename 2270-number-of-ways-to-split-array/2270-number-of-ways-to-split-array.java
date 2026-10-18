class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        
        for (int x : nums) {
            totalSum += x;
        }

        long leftSum = 0;
        int ans = 0;

        // right part must be non-empty
        for (int i = 0; i + 1 < nums.length; ++i) {
            leftSum += nums[i]; 

            // Right sum = total sum - left sum
            // Count split if left sum >= right sum
            if (leftSum >= totalSum - leftSum) {
                ans++;
            }
        }

        return ans;
    }
}