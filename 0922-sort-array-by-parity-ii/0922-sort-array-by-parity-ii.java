class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int even = 0;
        int odd = 1;

        for(int val : nums){
            if(val%2 == 0){
                ans[even] = val;
                even += 2;
            }
            else{
                ans[odd] = val;
                odd += 2;
            }
        }
        return ans;

    }
}