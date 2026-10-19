class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];
        int xor = 0;

        // Calculate XOR of all elements
        for (int num : nums) {
            xor ^= num;
        }

        int mask = (1 << maximumBit) - 1;

        // Process queries in reverse order
        for (int i = 0; i < n; i++) {
            ans[i] = xor ^ mask; // Maximum XOR value
            xor ^= nums[n - 1 - i]; // Remove last remaining element
        }

        return ans;
    }
}
