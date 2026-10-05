class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);

        // If target isn't present, lb either equals n or points to a different value.
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        int ub = upperBound(nums, target);
        return new int[]{lb, ub - 1};
    }

    // First index i such that nums[i] >= target
    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length;   // note: right = n (half-open range)

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;        // mid could be the answer, keep it
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // First index i such that nums[i] > target
    private int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}