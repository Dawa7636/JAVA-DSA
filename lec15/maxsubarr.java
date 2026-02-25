class Solution {
    // kadane Algorithm
    public int maxsubarr(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(sum<0){
                sum = 0;
            }
            sum += nums[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
