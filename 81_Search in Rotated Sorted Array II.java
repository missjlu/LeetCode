public class Solution {
    public boolean search(int[] A, int target) {
        
        int start = 0, end = A.length-1;
        
        while(start <= end) {
            
            int mid = (end-start)/2 +start;
            
            if(A[mid] == target) return true;
            
            
            if(A[mid]<A[end]) {
                
                if(A[mid]<target && target <=A[end])
                    start = mid+1;
                else
                    end = mid-1;
                
            }
            else if (A[mid]>A[end]) {
                
                if(A[mid]>target && target >=A[start])
                    end = mid-1;
                else
                    start = mid+1;
                    
            }
            else {
                end--;
            }
            
        }
        
        return false;
        
        
        
    }
}