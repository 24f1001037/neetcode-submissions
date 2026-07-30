class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[32];
        int left = 0;
        int or = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < n; right++){
            or |= nums[right];
            for(int b = 0; b < 32; b++){
                if(((nums[right] >> b) & 1) == 1)
                    count[b]++;
            }
            while(or >= k && left <= right){
                ans = Math.min(ans, right - left + 1);
                for(int i = 0; i < 32; i++){
                    if(((nums[left] >> i) & 1) == 1){
                        count[i]--;
                        if(count[i] == 0)
                            or ^= (1 << i);
                    }
                }
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}