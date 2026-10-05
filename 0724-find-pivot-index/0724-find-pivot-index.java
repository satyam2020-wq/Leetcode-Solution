class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }

        rightSum[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {

            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == n - 1) ? 0 : rightSum[i + 1];

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}