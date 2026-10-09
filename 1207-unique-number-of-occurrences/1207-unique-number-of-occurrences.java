class Solution {
    // Core Idea: Count the frequency of each number, then use a HashSet
    // to check whether any two numbers have the same frequency.

    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];

        // Count frequency of each number
        for (int num : arr) {
            freq[num + 1000]++;
        }

        HashSet<Integer> set = new HashSet<>();

        // Check whether frequencies are unique
        for (int count : freq) {
            if (count > 0 && !set.add(count)) {
                return false;
            }
        }

        return true;
    }
}