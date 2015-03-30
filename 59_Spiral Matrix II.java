public class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] res = new int[n][n];
        if(n == 0) return res;
        
        int num = 1;
        
        int row = 0;
        int col = -1;
        
        while(true) {
            for(int i=0; i<n; i++) {
                res[row][++col] = num++;
            }
            if(--n == 0) break;
            
            for(int i=0; i<n; i++) {
                res[++row][col] = num++;
            }
            //if(--n == 0) break;
            
            for(int i=0; i<n; i++) {
                res[row][--col] = num++;
            }
            if(--n == 0) break;
            
            for(int i=0; i<n; i++) {
                res[--row][col] = num++;
            }
            //if(--n == 0) break;
        }
        
        
        return res;
        
        
    }
}