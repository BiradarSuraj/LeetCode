class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        if(l == 1) {
            return nums[0];
        }
        int max_sum = nums[0], curr_sum = nums[0];
        
        for(int i=1; i<l; i++) {
            curr_sum = Math.max(curr_sum+nums[i],nums[i]);
            max_sum = Math.max(curr_sum,max_sum);
            
        }
        
        return max_sum;
    }
}