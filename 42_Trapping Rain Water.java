public class Solution {
    public int trap(int[] A) {
        
        int res = 0;
        int[] num = new int[A.length];
        int max = 0;
        for(int i=0; i<A.length; i++) {
            num[i] = max;
            max = Math.max(max, A[i]);
            
            
        }
        
        max=0;
        for(int i=A.length-1; i>=0; i--) {
            
            int cur = Math.min(max,num[i]);
            max = Math.max(max,A[i]);
            
            if(cur>A[i])
                res += (cur-A[i]);
            
        }
        
        return res;
        
        
    }
}