class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        // maxLeft stores the maximum value of (values[i] + i) for i < j
        int maxLeft = values[0] + 0; 

        for (int j = 1; j < values.length; j++) {
            // Calculate the score if current index j is the right spot
            maxScore = Math.max(maxScore, maxLeft + values[j] - j);
            
            // Update maxLeft to include the current index j for future pairs
            maxLeft = Math.max(maxLeft, values[j] + j);
        }

        return maxScore;
    }
}
