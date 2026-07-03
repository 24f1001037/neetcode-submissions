class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        boolean[][] dp = new boolean[n][n];
        int maxLength = 0;
        int start = 0, end = 0;
        for(int i = n - 1; i >= 0; i--){
            for(int j = i; j < n; j++){
                if(s.charAt(i) == s.charAt(j) && ((j - i) <= 2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    
                    if(maxLength < (j - i + 1)){
                        maxLength = j - i + 1;
                        start = i;
                        end = j + 1; 
                        //result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return  s.substring(start, end);
    }
}