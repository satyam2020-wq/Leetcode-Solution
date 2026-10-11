class Solution {
        // Core Idea: Track the minimum element seen so far.
    // Calculate the difference between the current element and
    // the minimum previous element. Return -1 if no valid pair exists.
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;

        for(int i=1;i<nums.length;i++){
            //current elements must be greater thant he previous minimum 
            if(nums[i] > min){
                maxDiff = Math.max(maxDiff,nums[i] - min);
            }

                //update minimum element
                min = Math.min(min,nums[i]);
            }
        return maxDiff;
    }
}