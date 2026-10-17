class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0, h = 0; // ans = highest altitude, h = current altitude

        for (int val : gain) {
            h += val;;                  // Add gain to get current altitude
            ans = Math.max(ans, h);  // Update maximum altitude
        }

        return ans; // Return the highest altitude reached
    }
}