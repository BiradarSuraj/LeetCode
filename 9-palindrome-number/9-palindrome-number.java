class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        int r;
        int temp = x;
        
        while (x > 0) {
            r = x % 10;
            n = n * 10 + r;
            x = x/10;
        }
        
        if(temp == n) {
            return true;
        } 
        else {
            return false;
        }
        
    }
    
    // public static void main(String[] args) {
    //     Solution s = new Solution();
    //     s.isPalindrome(121);
    // }
}