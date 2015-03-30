public class Solution {
    public int jump(int[] A) {
        
        int reach=0;
        int lastReach=0;
        int step=0;
        
        for(int i=0; i<A.length&&reach>=i; i++) {
                if(lastReach<i) {
                    step++;
                    lastReach = reach;
                }
            
                reach = Math.max(reach, i+A[i]);
            
            
        }
        
        return step;
        
        
    }
}