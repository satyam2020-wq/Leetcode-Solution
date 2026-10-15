 // Time Complexity: O(log10(|x|))
// Space Complexity: O(1)
class Solution {
    public int reverse(int x) {
        int ans = 0;
        // Extract digits and reverse the number
        while (x != 0) {
       int digit = x % 10; // Extract the last digit
            // Check for integer overflow
            if (ans > Integer.MAX_VALUE / 10 ||
                (ans == Integer.MAX_VALUE / 10 && digit > 7) ||
                
                ans < Integer.MIN_VALUE / 10 ||
                (ans == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            ans = ans * 10 + digit; // Append the digit
            x = x / 10;             // Remove the last digit
        }

        return ans;
    }
}