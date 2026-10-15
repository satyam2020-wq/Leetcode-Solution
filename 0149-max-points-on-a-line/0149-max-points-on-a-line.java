class Solution {
    // Time Complexity: O(n^2 * log M)
    // Space Complexity: O(n)
    // M = maximum coordinate difference

    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int res = 0;

        // Fix each point as the anchor
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            int currMax = 0;

            // Calculate normalized slopes from the anchor
            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                // Reduce the slope using GCD
                int gcd = gcd(Math.abs(dx), Math.abs(dy));

                dx /= gcd;
                dy /= gcd;

                // Normalize equivalent slopes
                if (dx == 0) {
                    dy = 1; // Vertical line
                } else if (dy == 0) {
                    dx = 1; // Horizontal line
                } else if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                // Count points having the same slope
                String slope = dy + "/" + dx;
                int count = map.getOrDefault(slope, 0) + 1;
                map.put(slope, count);

                // Track maximum points for this anchor
                currMax = Math.max(currMax, count);
            }

            // Add 1 for the anchor point
            res = Math.max(res, currMax + 1);
        }

        return res;
    }

    // Euclidean algorithm to calculate GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}