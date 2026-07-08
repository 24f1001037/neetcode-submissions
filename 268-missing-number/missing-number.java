class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += nums[i];
        }
        return (size * (size + 1))/2 - sum;
    }
}