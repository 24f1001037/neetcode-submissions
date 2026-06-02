class Solution {
    public int removeElement(int[] nums, int val) {
        int to = 0;
        for(int from = 0; from < nums.length; from++){
            if(nums[from] !=  val){
                nums[to] = nums[from];
                to++;
            }
        }
        return to;
        
    }
}