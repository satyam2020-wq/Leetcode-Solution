class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        //count frequency of each character
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        //store characters in list
        List<Character> list = new ArrayList<>();
        for(int i=0;i<128;i++){
            if(freq[i] > 0){
                list.add((char)i);
            }
        }

        //sort characters by frequency in descending order
        list.sort((a,b) -> freq[b] - freq[a]);
        StringBuilder result = new StringBuilder();
        for(char ch : list){
            for(int i=0;i<freq[ch];i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}