class Solution {
    private int[] nums;
    private int[] t; // Temporary array used to merge the two sorted halves.

    public int reversePairs(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        this.t = new int[n];

        return mergeSort(0, n - 1);
    }

    private int mergeSort(int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = (left + right) >> 1;

        // Count reverse pairs in both halves.
        int ans = mergeSort(left, mid) + mergeSort(mid + 1, right);

        // Count cross-pairs satisfying nums[i] > 2 * nums[j].
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j] * 2L) {
                i++;
            } else {
                // All remaining left-half elements form reverse pairs with nums[j].
                ans += mid - i + 1;
                j++;
            }
        }

        // Merge both sorted halves into the temporary array t.
        i = left;
        j = mid + 1;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                t[k++] = nums[i++];
            } else {
                t[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            t[k++] = nums[i++];
        }

        while (j <= right) {
            t[k++] = nums[j++];
        }

        // Copy the merged elements back into the original array.
        for (i = left; i <= right; i++) {
            nums[i] = t[i - left];
        }

        return ans;
    }
}