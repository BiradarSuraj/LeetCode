class Solution {
public:
    bool isPalindrome(int x) {
        int temp = x;
        unsigned int n = 0;
        int r;
        
        while(x > 0){
            r = x%10;
            n = n*10+r;
            x = x/10;
        }
        
        if(temp == n){
            return true;
        }
        else{
            return false;
        }
    }
};