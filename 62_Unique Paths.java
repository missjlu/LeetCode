public class Solution {
    
    //res[i][j] = res[i-1][j]+res[i][j-1]
    public int uniquePaths(int m, int n) {
        int[] res = new int[n];
        res[0]=1;
        for(int i=0; i<m; i++) {
            for(int j=1; j<n; j++)
                res[j] += res[j-1];
        }
        
        return res[n-1];
        
    }
}