public class Solution {
    public int threeSumClosest(int[] num, int target) {
        
        if(num == null || num.length<=2)  
            return Integer.MIN_VALUE;
        
        int closest = num[0]+num[1]+num[2]-target;
        
        Arrays.sort(num);
        
        for(int i=num.length-1; i>=2; i--) {
            int curr = twoSum(num, i-1, -num[i]+target);
            
            if(Math.abs(curr)<Math.abs(closest))
                closest = curr;
        }
        
        return closest+target;
        
    }
    
    private int twoSum(int[] num, int end, int target) {
        
        int closest = num[end]+num[end-1]-target;
        
        int start = 0;
        while(end>start) {
            
            if(num[start]+num[end] ==  target) {
                return 0;
            }
            
            int diff = num[start]+num[end]-target;
            
            if(Math.abs(diff)<Math.abs(closest))
                closest = diff;
            
            if(num[start]+num[end] > target) {
                end--;
            }
            else {
                start++;
            }
            
            
            
        }
        
        return closest;
        
    }
    
    
}