class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int currMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int val : nums) {

            // Kadane for maximum subarray
            currMax = Math.max(val, currMax + val);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for minimum subarray
            currMin = Math.min(val, currMin + val);
            minSum = Math.min(minSum, currMin);

            totalSum += val;
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Circular subarray sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }
}