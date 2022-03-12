class Solution {
    public void reverseString(char[] s) {
        
        int start = 0;
        int end = s.length;
        int mid = start + (end-start)/2;
        int l = end-1;
        while(start<mid){
            char temp = s[start];
            s[start] = s[l];
            s[l] = temp;
            start++;
            l--;
        }
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] +" ");
        }
    }
}