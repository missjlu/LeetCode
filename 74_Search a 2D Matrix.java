public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int start = 0;
        int end = matrix.length-1;
        
        while(start <= end) {
            int mid = (end-start)/2 +start;
            
            if(matrix[mid][0] == target) {
                return true;   
            }
            else if(matrix[mid][0] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        //attention to check
        if(end<0) return false;
        
        int row = end;
        
        start = 0;
        end = matrix[0].length-1;
        
        while(start <=end) {
            int mid = (end-start)/2 +start;
            
            if(matrix[row][mid] == target) {
                return true;   
            }
            else if(matrix[row][mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        
        return false;
        
        
        
        
    }
}