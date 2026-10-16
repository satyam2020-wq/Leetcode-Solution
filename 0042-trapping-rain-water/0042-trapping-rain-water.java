// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;   // Maximum height seen from the left
        int rightMax = 0;  // Maximum height seen from the right

        int water = 0;     // Total trapped rainwater

        while (left < right) {
            if (height[left] < height[right]) {

                leftMax = Math.max(leftMax, height[left]); // Update the maximum height on the left
                // Water trapped = left maximum - current height
                water += leftMax - height[left];
                left++;

            } else {

                // Update the maximum height on the right
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];  // Water trapped = right maximum - current height
                right--;
            }
        }
        
        return water;
    }
}