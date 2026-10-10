// Time Complexity: O(k), where k is the number of set bits
// Space Complexity: O(1)
class Solution {

    public int hammingWeight(int n) {
        // treat n as an unsigned value
            int count = 0;
            while(n!= 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
    
}
        
    