class Solution {
    public char findTheDifference(String s, String t) {
        int diff = 0;
        int i = 0;
        
        while(i<s.length()) {
            diff += t.charAt(i)-s.charAt(i);
            i++;
        }
        
        diff += t.charAt(i);
        return (char) diff;
    }
}