class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // find the first decreasing element from right
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        //find the smallest elements greater than nums[i] and search from right
        if(i >= 0){
            int j = n - 1;

            while(nums[j] <= nums[i]){
                j--;
            }
            // swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        // reverse the elements after index i 
        int left = i + 1;
        int right = n - 1;

        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}