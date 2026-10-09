class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int duplicate = -1;
        int missing = -1;
        int n = nums.length;

        // find the duplicate number
        for(int num : nums){
            if(set.contains(num)){
                duplicate = num;
            }
            set.add(num);
        }
        // find the missing number
        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
            missing = i;
            }
        }
        return new int[]{duplicate,missing};
    }
}