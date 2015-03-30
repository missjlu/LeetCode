public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        if(triangle.size()==1) return triangle.get(0).get(0);
        
        int[] res = new int[triangle.size()];
        
        for(int i=0;i<triangle.size();i++) {  
            res[i] = triangle.get(triangle.size()-1).get(i);  
        } 
        
        for(int i=triangle.size()-2; i>=0; i--)
            for(int j=0; j<=i; j++)
                res[j] = triangle.get(i).get(j) + Math.min(res[j],res[j+1]);
        
        return res[0];
        
    }
}