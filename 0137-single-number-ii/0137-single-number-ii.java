// Time Complexity: O(n log n)
// Space Complexity: O(log n)
class Solution {
     public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i += 3) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }

        // If the single number is at the end.
        return nums[nums.length - 1];
    }
}