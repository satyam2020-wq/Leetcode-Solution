class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sFreq = new int[26];
        int[] targetFreq = new int[26];

        // Count characters available in s
        for (char ch : s.toCharArray()) {
            sFreq[ch - 'a']++;
        }

        // Count characters required by target
        for (char ch : target.toCharArray()) {
            targetFreq[ch - 'a']++;
        }

        int result = Integer.MAX_VALUE;

        // Find the limiting character
        for (int i = 0; i < 26; i++) {
            if (targetFreq[i] > 0) {
                result = Math.min(result, sFreq[i] / targetFreq[i]);
            }
        }
        return result;
    }
}
