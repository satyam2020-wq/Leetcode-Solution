class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;     // left person is lightest
        int right = people.length-1; // righ person is heaviest
        int boats = 0;

        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}