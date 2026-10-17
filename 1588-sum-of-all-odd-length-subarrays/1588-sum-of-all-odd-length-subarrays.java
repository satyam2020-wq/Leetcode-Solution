class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // Build subarrays starting at index i
            for (int j = i; j < n; j++) {
                currentSum += arr[j];

                // Odd length subarray: (j - i + 1)
                if ((j - i + 1) % 2 != 0) {
                    totalSum += currentSum;
                }
            }
        }

        return totalSum;
    }
}