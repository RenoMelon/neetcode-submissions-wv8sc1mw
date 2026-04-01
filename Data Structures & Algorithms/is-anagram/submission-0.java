class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> wordMap = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            wordMap.put(c, wordMap.getOrDefault(c, 0) - 1);
        }

        for(int count : wordMap.values()){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}
