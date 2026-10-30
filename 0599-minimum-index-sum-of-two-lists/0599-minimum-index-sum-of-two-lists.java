class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();

        int minSum = Integer.MAX_VALUE;

        for (int j = 0; j < list2.length; j++) {

            String word = list2[j];

            if (map.containsKey(word)) {

                // Calculate the sum of indices.
                int sum = map.get(word) + j;

                if (sum < minSum) {
                    minSum = sum;

                    // Remove previous answers.
                    ans.clear();

                    // Add the new minimum-sum word.
                    ans.add(word);
                }

                // Another word has the same minimum sum.
                else if (sum == minSum) {
                    ans.add(word);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}
