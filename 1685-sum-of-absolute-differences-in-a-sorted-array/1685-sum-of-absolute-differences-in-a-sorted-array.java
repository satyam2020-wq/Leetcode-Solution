class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        long totalSum = 0;

        // Calculate the sum of all elements
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;

        // Calculate absolute differences for each element
        for (int i = 0; i < n; i++) {
            long leftCount = i;
            long rightCount = n - i - 1;

            // Sum of differences with elements on the left
            long leftDiff = (long) nums[i] * leftCount - leftSum;

            // Sum of differences with elements on the right
            long rightSum = totalSum - leftSum - nums[i];
            long rightDiff = rightSum - (long) nums[i] * rightCount;

            // Store the total absolute difference
            ans[i] = (int) (leftDiff + rightDiff);

            // Update sum of elements on the left
            leftSum += nums[i];
        }

        return ans;
    }
}