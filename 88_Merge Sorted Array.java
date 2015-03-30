public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        
        if(A == null || B == null)
            return;
         
        int index1 = m-1;
        int index2 = n-1;
        int index = m+n-1;
        //pay attention!!! use &&
        while(index1>=0 && index2>=0) {
            
            if(A[index1] > B[index2])
                A[index--] = A[index1--];
            else
                A[index--] = B[index2--];
            
            
        }
        
        while(index2>=0) {
            A[index--] = B[index2--];
        }
        
        
        
    }
}