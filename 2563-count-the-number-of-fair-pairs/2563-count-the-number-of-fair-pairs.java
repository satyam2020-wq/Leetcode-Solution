class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        //A pair is fair if lower <= nums[i] + nums[j] <= upper
        //pair with sum <= upper - pair with sum < lower.
        return count(nums,upper) - count(nums,lower-1);
    }

    private long count(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        long count = 0;

        while(left < right){
            if(nums[left] + nums[right] <= target){
                count += right - left;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}