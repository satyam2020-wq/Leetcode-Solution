class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }
        int leftSum = 0;
        // check each index as a middle index
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }
            //include the current element in the left sum
            leftSum += nums[i];
        }
        // no middleindex found
        return -1;
    }
}