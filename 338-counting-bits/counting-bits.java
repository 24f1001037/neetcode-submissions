class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++){
            result[i] = setBits(i);
        }
        return result;
    }
    public int setBits(int n){
        int count = 0;
        while(n != 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
}