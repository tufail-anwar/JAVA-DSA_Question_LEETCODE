class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return queen(board,0);
    }
    public List<List<String>> queen(boolean[][] board,int r){
        if(r==board.length){
            List<List<String>> list=new ArrayList<>();
            list.add(display(board));
            return list;
        }
       List<List<String>> list=new ArrayList<>();
        for(int c=0;c<board.length;c++){
            if(isSafe(board,r,c)){
                board[r][c]=true;
                list.addAll(queen(board,r+1));
                board[r][c]=false;
            }
        }
        return list;
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
    public List<String> display(boolean[][] board){
         ArrayList<String> list=new ArrayList<>();
        for(boolean[] r:board){
            StringBuilder sb = new StringBuilder();
            for (boolean cell : r) {
                if (cell) sb.append('Q');
                else sb.append('.');
            }
            list.add(sb.toString());
        }
        return list;
        
    }
}