// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int countDigitOne(int n) {
        int count = 0;

        // Check each digit position
        for (long factor = 1; factor <= n; factor *= 10) {
            long lower = n % factor;            //right of the current position
            long current = (n / factor) % 10;   // Digit at the current position
            long higher = n / (factor * 10);    //left of the current position

            if (current == 0) {               //count ones from complete higher cycles
                count += higher * factor;

            } else if (current == 1) {       //include higher cycles and lower digits
                count += higher * factor + lower + 1;

            } else {                         //greater than 1: include one extra cycle
                count += (higher + 1) * factor;
            }
        }

        return count;
    }
}