class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase().replaceAll("([^a-z0-9])", "");
        
        int slen = s.length();
        
        if (slen == 1) {
            return true;
        }
        
        int start = 0;
        int end = slen - 1;
        char[] sChar = s.toCharArray();
        while (start<end) {
            if (sChar[start] != sChar[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}