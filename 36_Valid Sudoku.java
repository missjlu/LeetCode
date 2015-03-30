public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++) {
            
            boolean[] used = new boolean[9];
            
            for(int j=0; j<9; j++) {
                
                if(board[i][j] !='.') {
                
                    if(used[board[i][j]-'1']) return false;
                
                    used[board[i][j]-'1'] = true;
                }
            }
            
        }
        
        for(int i=0; i<9; i++) {
            
            boolean[] used = new boolean[9];
            
            for(int j=0; j<9; j++) {
                
                if(board[j][i] !='.') {
                
                    if(used[board[j][i]-'1']) return false;
                
                    used[board[j][i]-'1'] = true;
                }
                
            }
            
        }
        
        
        for(int block=0; block<9; block++) {
            boolean[] used = new boolean[9];
            
            for(int i=block/3*3; i<block/3*3+3; i++)
        
                for(int j=block%3*3; j<block%3*3+3; j++) {
                
                    if(board[j][i] !='.') {
                
                        if(used[board[j][i]-'1']) return false;
                
                        used[board[j][i]-'1'] = true;
                    }
                
            }
            
        }
        
        
        return true;  
        
        
        
    }
}