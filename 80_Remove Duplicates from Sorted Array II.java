public class Solution {
    public int removeDuplicates(int[] A) {
        
        if(A == null || A.length == 0)
            return 0;
        
        int counter = 0;
        
        int index = 1;
        for(int i=1; i< A.length; i++) {
            
            if(A[i] != A[i-1]) {
                A[index++] = A[i];
                counter = 0;
            } else {
                if(counter == 0) {
                    A[index++] = A[i];
                    counter++;
                }
            }
            
            
        }
        
        return index;
        
        
    }
}