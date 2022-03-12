class Solution {
    public int mySqrt(int x) {
        int remain = x;
        int i = 1;
        int count = 0;
        while(remain>0){
            if (remain>=i){
                remain = remain-i;
                count++;
            }
            else {
                break;
            }
            i=i+2;

        }
        return count;
    }
}