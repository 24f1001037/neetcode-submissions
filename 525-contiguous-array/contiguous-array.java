class Solution {
    public int findMaxLength(int[] nums) {
        int cSum = 0, maxLength = 0;
        HashMap <Integer,Integer> hMap = new HashMap<>();
        hMap.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            cSum += (nums[i] == 0)? -1 : 1;
            if(hMap.containsKey(cSum)){
                int len = i - hMap.get(cSum);
                maxLength = Math.max(len, maxLength);
            } else{
                hMap.put(cSum, i);
            }
        }
        return maxLength;    
    }
}