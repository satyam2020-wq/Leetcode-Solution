class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0; 
        int minSum = 0; // stores minium prefix sum
       
       // calculate prefix sums and find minimum
        for(int num : nums){
            sum += num;

            //update minimum prefix sum
            minSum = Math.min(minSum,sum);
        }
        //starting value must keep every prefix sum >=
        return Math.max(1, 1-minSum);
    }
}