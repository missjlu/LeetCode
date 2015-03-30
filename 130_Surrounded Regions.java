public class Solution {
    
    //only elements that could connected to an edge O element through dfs are the ones that does not need to be changed to X
    public void solve(char[][] board) {
        
        if(board==null || board.length<=1 || board[0].length<=1)  
        return;
        
        for(int i=0; i<board.length; i++) {
            fill(board, i, 0);
            fill(board, i, board[0].length-1);
        }
        
        for(int i=0; i<board[0].length; i++) {
            fill(board, 0, i);
            fill(board, board.length-1, i);
        }
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == '#') {
                    board[i][j] = 'O';
                }
                else
                    board[i][j] = 'X';
            }
        }
    }
    
    private void fill(char[][] board, int i, int j) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        if(board[i][j] != 'O')
            return;
        board[i][j] = '#';
        
        int code = i*board[0].length+j;
        queue.add(code);
        
        while(!queue.isEmpty()) {
            
            int curr = queue.poll();
            int row = curr/board[0].length;
            int col = curr%board[0].length;
            
            if(row>0 && board[row-1][col] == 'O') {
                board[row-1][col] = '#';
                queue.add((row-1)*board[0].length+col);
            }
            
            if(row<board.length-1 && board[row+1][col] == 'O') {
                board[row+1][col] = '#';
                queue.add((row+1)*board[0].length+col);
            } 
                
            if(col>0 && board[row][col-1] == 'O') {
                board[row][col-1] = '#';
                queue.add(row*board[0].length+col-1);
            }
                
            if(col<board[0].length-1 && board[row][col+1] == 'O') {
                board[row][col+1] = '#';
                queue.add(row*board[0].length+col+1);
            }
            
        }
        
    }
    
    
    
    
    
}