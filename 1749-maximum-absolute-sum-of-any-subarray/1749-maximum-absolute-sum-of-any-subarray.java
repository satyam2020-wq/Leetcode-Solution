class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currMax = 0;
        int maxSum = 0;

        int currMin = 0;
        int minSum = 0;

        for(int val : nums){
            // Normal Kadane's for maximum subarray
            currMax = Math.max(0,currMax + val);
            maxSum = Math.max(maxSum,currMax);

            //Kadane's for minimum subarray
            currMin = Math.min(0,currMin + val);
            minSum = Math.min(minSum,currMin);
        }
        return Math.max(maxSum,-minSum);
    }
}