class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
         if(n == 0) return 0;

        int i=0;
        for(i=0; i<h-n+1; i++){
            String str = haystack.substring(i, i+n);
            if(str.equals(needle)){
                return i;
            }
        }

        return -1;
    }
}