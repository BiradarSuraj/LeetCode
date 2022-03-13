class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            char character = s.charAt(i);
            h.put(character,h.getOrDefault(character,0)+1);
        }
        
        for (int j=0; j<s.length(); j++) {
            char character = s.charAt(j);
            if (h.get(character)==1){
                return j;
            }
        }
        return -1;
    }
}