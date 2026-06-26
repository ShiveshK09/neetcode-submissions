class Solution {
     public boolean exist(char[][] board, String word) {
        for(int r=0;r<board.length;r++)
        {
            for(int c=0;c<board[0].length;c++)
            {
                if(dfs(board,word,r,c,0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,String word,int r,int c,int cur){
        if(word.length()==cur) return true;
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='#') return false;
        char ch=board[r][c];
        if(word.charAt(cur)!=ch) return false;
        board[r][c]='#';
        boolean top=dfs(board,word,r-1,c,cur+1);
        boolean bottom=dfs(board,word,r+1,c,cur+1);
        boolean left=dfs(board,word,r,c-1,cur+1);
        boolean right=dfs(board,word,r,c+1,cur+1);
        board[r][c]=ch;
        return top||bottom||left||right;
    }
}
