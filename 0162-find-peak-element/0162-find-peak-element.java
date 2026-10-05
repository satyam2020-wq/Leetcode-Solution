class Solution {
    public int findPeakElement(int[] nums) {

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] > nums[j]) {
                return i;
            }

            i++;
            j++;
        }

        return nums.length - 1;
    }
}