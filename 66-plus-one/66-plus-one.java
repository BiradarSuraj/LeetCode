class Solution {
    public int[] plusOne(int[] digits) {
         {
        int l=digits.length;
        for (int i =  l-1; i >=0; i--)
        {
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
        }
      if(digits[0]==0)
      {
          int[] num1=new int[l+1];
          num1[0]=1;
          return num1;
      }
      return digits;
        
    }
}
}