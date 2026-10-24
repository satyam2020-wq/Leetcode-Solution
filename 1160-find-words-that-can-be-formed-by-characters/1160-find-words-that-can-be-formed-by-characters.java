class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];


        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int totalLength = 0;

        for (String word : words) {
            int[] available = freq.clone();
            boolean canForm = true;

            // Check whether every character is available
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';

                if (available[index] == 0) {
                    canForm = false;
                    break;
                }

                available[index]--;
            }

            // Count only words that can be formed completely
            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}
