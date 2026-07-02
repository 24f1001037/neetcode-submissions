class Solution {
    int[] dp;
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        dp = new int[nums.length];
        int r1 = helper(0, nums.length - 2, nums);
        int r2 = helper(1, nums.length - 1, nums);
        return Math.max(r1,r2);

    }
    public int helper(int i1, int i2, int[] nums){
        dp[i1] = nums[i1];
        dp[i1 + 1] = Math.max(nums[i1],nums[i1 + 1]);
        for(int idx = i1 + 2; idx <= i2; idx++ ){
            dp[idx] = Math.max(nums[idx] + dp[idx - 2], dp[idx - 1]);
        }
        return (i1 == 0) ? dp[nums.length - 2] : dp[nums.length - 1];
    }
}