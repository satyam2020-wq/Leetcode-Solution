class Solution {
    // Core Idea: Use character frequencies to form pairs.
    // Every even count can be used; one odd-count character can occupy the center.

    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Use pairs of characters
        for (int count : freq) {
            length += (count / 2) * 2;

            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd-count character can occupy the center
        if (hasOdd) {
            length++;
        }

        return length;
    }
}