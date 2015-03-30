public class Solution {
    public int maxProduct(int[] A) {
        int min = A[0], max = A[0], maxPro = A[0];
        
        for(int i= 1; i<A.length; i++) {
            int mx = max, mn = min;
            max = Math.max(Math.max(A[i],mn*A[i]),mx*A[i]);
            min = Math.min(Math.min(A[i],mn*A[i]),mx*A[i]);
            maxPro = Math.max(max, maxPro);
        }
        
        return maxPro;
        
    }
}