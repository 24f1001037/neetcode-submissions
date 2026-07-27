class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] ans = new int [n];

        for(int left = n - 2 ; left >= 0 ; left-- ) {
            int right = left + 1;
            while(ans[right] != 0 && temperatures[left] >= temperatures[right]){
                right += ans[right]; 
            }

            if(temperatures[left] < temperatures[right]){
                ans[left] = right - left;
            }
        }
        return ans;
    }
}