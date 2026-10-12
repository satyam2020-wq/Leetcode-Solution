class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // stores the frequency of each element
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        //count the frequency of every element
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        //stores elements appearing more than n/3

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            //check whether the freuqency exceed n/3
            if(entry.getValue() > n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}