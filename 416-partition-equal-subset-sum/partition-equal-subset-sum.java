class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        // If sum is odd, cannot divide equally
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        // dp[i] = can we make sum i ?
        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        // Process each number
        for (int num : nums) {

            // Traverse backwards
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
        
    }
}