class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            // compare current element with next
            // % nhandles the last element by wrapping around to index 0
            if(nums[i] > nums[(i + 1) % n]){
                count++;
            }
        }
        return count <= 1;
    }
}