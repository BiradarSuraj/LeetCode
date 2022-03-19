class Solution {
    public int fib(int n) {
        if(n==1 || n==0 ){
            return n;
        }
        int sum =0;
        int n1=0, n2=1;
        for (int i=0; i<n-1; i++) {
            sum = n1+n2;
            int temp = n2;
            n2 = sum;
            n1 = temp;
        }
        return sum;
    }
}