class Solution {
    // we'll count character frequencies first then find the first character whose freq is 1.
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        //count frequency of each character
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)- 'a']++;
        }
        // find the first non-repeating character
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}