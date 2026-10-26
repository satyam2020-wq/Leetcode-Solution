class Solution {
    public boolean canReorderDoubled(int[] arr) {
        
        Map<Integer, Integer> freq = new HashMap<>();

        // Count occurrences of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Process smaller absolute values first
        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, (a, b) ->
            Integer.compare(Math.abs(a), Math.abs(b))
        );

        for (int x : nums) {
            if (freq.get(x) == 0) {
                continue;
            }

            int doubled = 2 * x;

            // Every x needs an available 2*x
            if (freq.getOrDefault(doubled, 0) == 0) {
                return false;
            }

            freq.put(x, freq.get(x) - 1);
            freq.put(doubled, freq.get(doubled) - 1);
        }

        return true;
    }
}
