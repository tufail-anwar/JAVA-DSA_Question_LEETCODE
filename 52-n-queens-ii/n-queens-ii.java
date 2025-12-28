class Solution {
    public int totalNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return queen(board,0);
    }
    public int queen(boolean[][] board,int r){
        if(r==board.length){
            // display(board);
            return 1;
        }
      int count=0;
        for(int c=0;c<board.length;c++){
            if(isSafe(board,r,c)){
                board[r][c]=true;
               count += queen(board,r+1);
                board[r][c]=false;
            }
        }
        return  count;
    }
    public boolean isSafe(boolean[][] board,int r,int c){
        for(int i=r;i>=0;i--){
            if(board[i][c]){
                return false;
            }
        }

         for(int i=1;i<=Math.min(r,c);i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        for(int i=1;i<=Math.min(r,board.length-1-c);i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    // public int display(boolean[][] board){
        
    //     for(boolean[] r:board){
          
    //         for (boolean cell : r) {
    //             if (cell) ret;
    //             else sb.append('.');
    //         }
    //         list.add(sb.toString());
    //     }
    //     return list;
        
    // }
}