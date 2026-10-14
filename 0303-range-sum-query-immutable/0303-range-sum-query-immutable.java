class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        //create a prefix sum array of size n+1
        prefix  = new int[nums.length + 1];

        // calculate cumaltive sums
        for(int i=0;i<nums.length;i++){
            prefix[i+1] = prefix[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // range sum = prefix sum upto right - prefix sum before it
        return prefix[right+1] - prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */