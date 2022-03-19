class Solution {
    public int climbStairs(int n) {
        if (n==0) return n;

        int x=1, y=2;
        if (n <= 2) {
            return n;
        }
        for (int i=3; i<n; i++){
            int temp = y;
            y += x;
            x = temp;
        }
        return x+y;
    }
}