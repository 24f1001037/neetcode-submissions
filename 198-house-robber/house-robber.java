class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int v1 = nums[0];
        int v2 = Math.max(nums[0], nums[1]);
        int val = v2;
        for(int i = 2; i < nums.length; i++){
            val = Math.max(v1 + nums[i], v2);
            v1 = v2;
            v2 = val;
        }
        return val;
    }
}