class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0;

        // Calculate total sum of the array
        for (int x : nums) {
            rightSum += x;
        }

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; ++i) {
            rightSum -= nums[i]; // Calculate sum of elements to the right
            
            // Store absolute difference between left and right sums
            ans[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i]; // Update left sum for the next index
        }

        return ans;
    }
}