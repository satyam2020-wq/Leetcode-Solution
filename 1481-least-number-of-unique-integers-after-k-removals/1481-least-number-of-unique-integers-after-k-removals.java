class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count the frequency of each integer
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(freq.values());

        // Process the least frequent integers first
        Collections.sort(frequencies);

        int unique = frequencies.size();

        for (int count : frequencies) {
            if (k >= count) {
                k -= count;
                unique--;
            } else {
                break;
            }
        }

        return unique;
    }
}
