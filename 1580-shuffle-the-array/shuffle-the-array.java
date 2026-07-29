class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int x = 0, y = n;
        for(int i = 0; i < 2*n; i+=2){
            result[i] = nums[x];
            result[i + 1] = nums[y];
            x++;
            y++;
        }
        return result;
    }
}