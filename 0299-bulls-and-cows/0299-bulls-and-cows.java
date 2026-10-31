
class Solution {
    public String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;
        int[] freq = new int[10];

        for (int i = 0; i < secret.length(); i++) {

            char s = secret.charAt(i);
            char g = guess.charAt(i);

            // Same digit at the same position = Bull.
            if (s == g) {
                bulls++;
            } else {
                // Store the unmatched secret digit.
                freq[s - '0']++;
            }
        }

        // Second pass: Find Cows.
        for (int i = 0; i < guess.length(); i++) {

            // Skip positions that were already counted as Bulls.
            if (secret.charAt(i) == guess.charAt(i)) {
                continue;
            }

            int digit = guess.charAt(i) - '0';

            // Check whether this guessed digit exists in secret.
            if (freq[digit] > 0) {
                cows++;

                // Consume this digit so it cannot be counted twice.
                freq[digit]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
