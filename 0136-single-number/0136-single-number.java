  // Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int val : nums) {
            ans ^= val; // XOR cancels duplicate numbers
        }

        return ans;
    }
}