class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int low = 0;
        for(int i = 1; i <= n; i++){           
            if((i & (i- 1)) == 0){
                result[i] = 1;
                low = i;
            } else{
                result[i] = result[i - low] + 1;
            }
        }
        return result;
    }
}