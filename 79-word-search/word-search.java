class Solution {
    int mc, mr;
    public boolean exist(char[][] board, String word) {
        mr = board.length;
        mc = board[0].length;
        boolean result = false;
        for(int r = 0; r < mr; r++){
            for(int c = 0; c < mc; c++){
                result = dfs(r,c,board,word, 0);
                if (result) {
                    return true;
                }
            }
        }
      return false;  
    }
    public boolean dfs(int r, int c, char[][] board, String word, int i){
        if(i == word.length()){
            return true;
        }
        if(r < 0 || c < 0 || r >= mr || c >= mc || board[r][c] == '#' || board[r][c] != word.charAt(i)){
            return false;
        }
        board[r][c] = '#';
        boolean res = dfs(r - 1, c, board, word, i + 1)||
                      dfs(r, c + 1, board, word, i + 1)||
                      dfs(r + 1, c, board, word, i + 1)||
                      dfs(r, c - 1, board, word, i + 1);
        board[r][c] = word.charAt(i);
        return res;
    }
}